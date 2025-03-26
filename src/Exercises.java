import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        // Задания и решения
        arrayListTasks();
        linkedListTasks();
        hashSetTasks();
        treeSetTasks();
        priorityQueueTasks();
        hashMapTasks();
        treeMapTasks();
    }

    // Задание 1: Работа с ArrayList
    private static void arrayListTasks() {
        System.out.println("\nArrayList Tasks:");

        // Задание 1.1: Очистить ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 22, 33, 40, 55));
        numbers.clear(); // Очистка списка
        System.out.println("ArrayList cleared: " + numbers);

        // Задание 1.2: Проверить, пуст ли ArrayList
        System.out.println("Is ArrayList empty? " + numbers.isEmpty());

        // Задание 1.3: Добавить элементы и уменьшить размер
        numbers.addAll(Arrays.asList(1, 2, 3, 4));
        ((ArrayList<Integer>) numbers).trimToSize(); // Уменьшить размер
        System.out.println("Trimmed ArrayList: " + numbers);

        // Задание 1.4: Установить емкость и заменить элемент
        numbers.ensureCapacity(10);
        numbers.set(1, 99); // Замена второго элемента
        System.out.println("Replaced second element: " + numbers);

        // Задание 1.5: Пройти по всем элементам
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at " + i + ": " + numbers.get(i));
        }

        // Задание 1.6: Проверить, содержит ли ArrayList определенный элемент
        boolean contains = numbers.contains(99);
        System.out.println("ArrayList contains 99? " + contains);

        // Задание 1.7: Получить индекс определенного элемента
        int index = numbers.indexOf(99);
        System.out.println("Index of 99: " + index);

        // Задание 1.8: Удалить элемент по индексу
        numbers.remove(2); // Удаляем третий элемент
        System.out.println("After removing element at index 2: " + numbers);

        // Задание 1.9: Проверить, пуст ли ArrayList после всех операций
        System.out.println("Is ArrayList empty now? " + numbers.isEmpty());
    }

    // Задание 2: Работа с LinkedList
    private static void linkedListTasks() {
        System.out.println("\nLinkedList Tasks:");

        // Задание 2.1: Получить первый и последний элементы списка
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Задание 2.2: Проверить, содержится ли элемент в списке
        System.out.println("Contains 'Two'? " + linkedList.contains("Two"));

        // Задание 2.3: Конвертировать LinkedList в ArrayList
        ArrayList<String> converted = new ArrayList<>(linkedList);
        System.out.println("Converted to ArrayList: " + converted);

        // Задание 2.4: Проверить равенство списков
        LinkedList<String> anotherList = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("Are linked lists equal? " + linkedList.equals(anotherList));

        // Задание 2.5: Заменить второй элемент
        linkedList.set(1, "Updated");
        System.out.println("Replaced second element: " + linkedList);

        // Задание 2.6: Удалить первый и последний элементы
        System.out.println("Removed first: " + linkedList.pollFirst());
        System.out.println("Removed last: " + linkedList.pollLast());

        // Задание 2.7: Пройти по всем элементам и вывести их
        System.out.println("All elements in the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Задание 2.8: Добавить новый элемент в начало
        linkedList.addFirst("New First");
        System.out.println("After adding new first element: " + linkedList);

        // Задание 2.9: Проверить, пуст ли LinkedList
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
    }

    // Задание 3: Работа с HashSet
    private static void hashSetTasks() {
        System.out.println("\nHashSet Tasks:");

        // Задание 3.1: Конвертировать HashSet в массив
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] array = set.toArray(new Integer[0]);
        System.out.println("Converted HashSet to array: " + Arrays.toString(array));

        // Задание 3.2: Конвертировать HashSet в TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println("Converted to TreeSet: " + treeSet);

        // Задание 3.3: Получить элементы, которые меньше 7
        System.out.println("Numbers less than 7: " + treeSet.headSet(7));

        // Задание 3.4: Оставить только общие элементы
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        set.retainAll(set2);
        System.out.println("Common elements: " + set);

        // Задание 3.5: Очистить HashSet
        set.clear();
        System.out.println("HashSet cleared: " + set);

        // Задание 3.6: Проверить, пуст ли HashSet
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Задание 3.7: Добавить элементы в HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("HashSet after adding elements: " + set);

        // Задание 3.8: Удалить конкретный элемент
        set.remove(20);
        System.out.println("HashSet after removing 20: " + set);
    }

    // Задание 4: Работа с TreeSet
    private static void treeSetTasks() {
        System.out.println("\nTreeSet Tasks:");

        // Задание 4.1: Получить элемент <= 25
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Element <= 25: " + treeSet.floor(25));

        // Задание 4.2: Получить элемент >= 25
        System.out.println("Element >= 25: " + treeSet.ceiling(25));

        // Задание 4.3: Получить элемент < 30
        System.out.println("Element < 30: " + treeSet.lower(30));

        // Задание 4.4: Удалить первый и последний элемент
        System.out.println("Removed first: " + treeSet.pollFirst());
        System.out.println("Removed last: " + treeSet.pollLast());

        // Задание 4.5: Удалить элемент 40
        treeSet.remove(40);
        System.out.println("Removed 40: " + treeSet);

        // Задание 4.6: Проверить, пуст ли TreeSet
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Задание 4.7: Добавить новый элемент
        treeSet.add(60);
        System.out.println("TreeSet after adding 60: " + treeSet);
    }

    // Задание 5: Работа с PriorityQueue
    private static void priorityQueueTasks() {
        System.out.println("\nPriorityQueue Tasks:");

        // Задание 5.1: Получить первый элемент
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5, 10, 15));
        System.out.println("Top element: " + pq.peek());

        // Задание 5.2: Удалить первый элемент
        System.out.println("Removed: " + pq.poll());

        // Задание 5.3: Конвертировать PriorityQueue в массив
        Object[] array = pq.toArray();
        System.out.println("Converted to array: " + Arrays.toString(array));

        // Задание 5.4: Печать содержимого очереди
        System.out.println("As string: " + pq.toString());

        // Задание 5.5: Добавить новый элемент
        pq.add(20);
        System.out.println("After adding 20: " + pq);
    }

    // Задание 6: Работа с HashMap
    private static void hashMapTasks() {
        System.out.println("\nHashMap Tasks:");

        // Задание 6.1: Создать и проверить наличие ключей и значений
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'A'? " + map.containsValue("A"));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Задание 6.2: Удалить элемент по ключу
        map.remove(1);
        System.out.println("After removing key 1: " + map);
    }

    // Задание 7: Работа с TreeMap
    private static void treeMapTasks() {
        System.out.println("\nTreeMap Tasks:");

        // Задание 7.1: Создать и вывести различные подмножества
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "X");
        treeMap.put(20, "Y");
        treeMap.put(30, "Z");

        System.out.println("SubMap (10 to 30): " + treeMap.subMap(10, 30));
        System.out.println("TailMap (>=20): " + treeMap.tailMap(20));
        System.out.println("Ceiling Entry for 25: " + treeMap.ceilingEntry(25));
        System.out.println("Ceiling Key for 25: " + treeMap.ceilingKey(25));
    }
}
