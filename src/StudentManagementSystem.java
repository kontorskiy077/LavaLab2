import java.util.*;

public class StudentManagementSystem {
    static class Student {
        private int id;
        private String fio;
        private int vozrast;
        private Set<String> kursy;

        public Student(int id, String fio, int vozrast) {
            this.id = id;
            this.fio = fio;
            this.vozrast = vozrast;
            this.kursy = new HashSet<>();
        }

        public int getId() {
            return id;
        }

        public String getFio() {
            return fio;
        }

        public void setFio(String fio) {
            this.fio = fio;
        }

        public int getVozrast() {
            return vozrast;
        }

        public void setVozrast(int vozrast) {
            this.vozrast = vozrast;
        }

        public Set<String> getKursy() {
            return kursy;
        }

        public void dobavitKurs(String kurs) {
            kursy.add(kurs);
        }

        @Override
        public String toString() {
            return "ID: " + id + ", ФИО: " + fio + ", Возраст: " + vozrast + ", Курсы: " + kursy;
        }
    }

    static class UpravlenieStudentami {
        private Map<Integer, Student> studenti = new HashMap<>();
        private Map<String, Set<Student>> kartaKursov = new HashMap<>();

        public void dobavitStudenta(Student student) {
            studenti.put(student.getId(), student);
            for (String kurs : student.getKursy()) {
                kartaKursov.computeIfAbsent(kurs, k -> new HashSet<>()).add(student);
            }
        }

        public void udalitStudenta(int id) {
            Student student = studenti.remove(id);
            if (student != null) {
                for (String kurs : student.getKursy()) {
                    kartaKursov.get(kurs).remove(student);
                }
            }
        }

        public Student naytiStudenta(int id) {
            return studenti.get(id);
        }

        public List<Student> vseStudentyPoId() {
            List<Student> spisok = new ArrayList<>(studenti.values());
            spisok.sort(Comparator.comparingInt(Student::getId));
            return spisok;
        }

        public Set<Student> studentyPoKursu(String kurs) {
            return kartaKursov.getOrDefault(kurs, new HashSet<>());
        }
    }

    public static void main(String[] args) {
        UpravlenieStudentami upravlenie = new UpravlenieStudentami();


        Student s1 = new Student(1, "Маратов Амир", 20);
        s1.dobavitKurs("Программирование на Java");
        s1.dobavitKurs("Машинное обучение");

        Student s2 = new Student(2, "Лия Исламова", 22);
        s2.dobavitKurs("Наука о данных");
        s2.dobavitKurs("Программирование на Java");

        upravlenie.dobavitStudenta(s1);
        upravlenie.dobavitStudenta(s2);


        System.out.println("Все студенты, отсортированные по ID:");
        for (Student s : upravlenie.vseStudentyPoId()) {
            System.out.println(s);
        }


        System.out.println("\nПоиск студента с ID 2:");
        System.out.println(upravlenie.naytiStudenta(2));


        System.out.println("\nСтуденты, записанные на курс 'Программирование на Java':");
        for (Student s : upravlenie.studentyPoKursu("Программирование на Java")) {
            System.out.println(s);
        }


        System.out.println("\nОбновление данных студента с ID 1:");
        s1.setFio("Маратов Амир Маратович");
        s1.setVozrast(21);
        s1.dobavitKurs("Глубокое обучение");
        System.out.println(s1);


        System.out.println("\nУдаление студента с ID 2:");
        upravlenie.udalitStudenta(2);


        System.out.println("Все студенты после удаления:");
        for (Student s : upravlenie.vseStudentyPoId()) {
            System.out.println(s);
        }
    }
}
