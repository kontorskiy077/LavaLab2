public class w3resourse {
    public static void main(String[] args) {
        System.out.println("Задание 17: Очистка массива");
        String[] arr = {"A", "B", "C"};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }

        System.out.println("Задание 18: Проверка, пуст ли массив");
        boolean isEmpty = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                isEmpty = false;
                break;
            }
        }
        System.out.println("Массив пуст: " + isEmpty);

        System.out.println("Задание 19: Уменьшение размера массива (обрезка)");
        String[] trimmed = new String[2];
        trimmed[0] = "A";
        trimmed[1] = "B";
        for (int i = 0; i < trimmed.length; i++) {
            System.out.println(trimmed[i]);
        }

        System.out.println("Задание 20: Увеличение размера массива");
        String[] enlarged = new String[5];
        enlarged[0] = "A";
        enlarged[1] = "B";
        for (int i = 0; i < enlarged.length; i++) {
            System.out.println("Индекс " + i + ": " + enlarged[i]);
        }

        System.out.println("Задание 21: Замена второго элемента массива");
        enlarged[1] = "Z";
        for (int i = 0; i < enlarged.length; i++) {
            System.out.println("Индекс " + i + ": " + enlarged[i]);
        }

        System.out.println("Задание 22: Вывод всех элементов массива по индексам");
        for (int i = 0; i < enlarged.length; i++) {
            System.out.println("Элемент " + i + ": " + enlarged[i]);
        }

        System.out.println("Задание 23: Первый элемент (не удаляя)");
        String first = enlarged[0];
        System.out.println("Первый элемент: " + first);

        System.out.println("Задание 24: Последний элемент (не удаляя)");
        String last = enlarged[enlarged.length - 1];
        System.out.println("Последний элемент: " + last);

        System.out.println("Задание 25: Проверка наличия элемента 'B'");
        boolean found = false;
        for (int i = 0; i < enlarged.length; i++) {
            if ("B".equals(enlarged[i])) {
                found = true;
                break;
            }
        }
        System.out.println("Элемент найден: " + found);

        System.out.println("Задание 26: Массив в массив (LinkedList -> ArrayList)");
        String[] linkedList = {"X", "Y", "Z"};
        String[] arrayList = new String[linkedList.length];
        for (int i = 0; i < linkedList.length; i++) {
            arrayList[i] = linkedList[i];
        }
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }

        System.out.println("Задание 27: Сравнение двух массивов");
        String[] anotherList = {"X", "Y", "Z"};
        boolean equal = true;
        if (arrayList.length != anotherList.length) {
            equal = false;
        } else {
            for (int i = 0; i < arrayList.length; i++) {
                if (!arrayList[i].equals(anotherList[i])) {
                    equal = false;
                    break;
                }
            }
            System.out.println("Массивы равны: " + equal);

            System.out.println("Задание 28: Проверка, пуст ли массив");
            boolean linkedEmpty = true;
            for (int i = 0; i < linkedList.length; i++) {
                if (linkedList[i] != null) {
                    linkedEmpty = false;
                    break;
                }
            }
            System.out.println("Массив пуст: " + linkedEmpty);

            System.out.println("Задание 29: Замена элемента в массиве");
            linkedList[1] = "REPLACED";
            for (int i = 0; i < linkedList.length; i++) {
                System.out.println(linkedList[i]);
            }

            System.out.println("Задание 30: Преобразование множества в массив");
            String[] set = {"Red", "Green", "Blue"};
            String[] setToArray = new String[set.length];
            for (int i = 0; i < set.length; i++) {
                setToArray[i] = set[i];
            }
            for (int i = 0; i < setToArray.length; i++) {
                System.out.println(setToArray[i]);
            }

            System.out.println("Задание 31: Преобразование множества в отсортированный массив");
            String[] treeSet = new String[set.length];
            for (int i = 0; i < set.length; i++) {
                treeSet[i] = set[i];
            }
            for (int i = 0; i < treeSet.length - 1; i++) {
                for (int j = i + 1; j < treeSet.length; j++) {
                    if (treeSet[i].compareTo(treeSet[j]) > 0) {
                        String temp = treeSet[i];
                        treeSet[i] = treeSet[j];
                        treeSet[j] = temp;
                    }
                }
            }
            for (int i = 0; i < treeSet.length; i++) {
                System.out.println(treeSet[i]);
            }


            System.out.println("Задание 32: Найти числа меньше 7");
            int[] treeNums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int i = 0; i < treeNums.length; i++) {
                if (treeNums[i] < 7) {
                    System.out.println(treeNums[i]);
                }
            }

            System.out.println("Задание 33: Найти элемент <= заданного (пример: 5)");
            int value = 5;
            int floor = -1;
            for (int i = 0; i < treeNums.length; i++) {
                if (treeNums[i] <= value) {
                    floor = treeNums[i];
                }
            }
            System.out.println("Наибольший элемент <= " + value + ": " + floor);

            System.out.println("Задание 34: Найти элемент >= заданного (пример: 5)");
            int ceiling = -1;
            for (int i = 0; i < treeNums.length; i++) {
                if (treeNums[i] >= value) {
                    ceiling = treeNums[i];
                    break;
                }
            }
            System.out.println("Наименьший элемент >= " + value + ": " + ceiling);

            System.out.println("Задание 35: Найти элемент < заданного (пример: 5)");
            int lower = -1;
            for (int i = 0; i < treeNums.length; i++) {
                if (treeNums[i] < value) {
                    lower = treeNums[i];
                }
            }
            System.out.println("Наибольший элемент < " + value + ": " + lower);

            System.out.println("Задание 36: Получить и удалить первый элемент");
            int[] temp = new int[treeNums.length - 1];
            int firstRemoved = treeNums[0];
            for (int i = 1; i < treeNums.length; i++) {
                temp[i - 1] = treeNums[i];
            }
            System.out.println("Удален первый элемент: " + firstRemoved);

            System.out.println("Задание 37: Получить и удалить последний элемент");
            int lastRemoved = temp[temp.length - 1];
            int[] temp2 = new int[temp.length - 1];
            for (int i = 0; i < temp2.length; i++) {
                temp2[i] = temp[i];
            }
            System.out.println("Удален последний элемент: " + lastRemoved);

            System.out.println("Задание 38: Удалить элемент = 5");
            int toRemove = 5;
            int[] withoutFive = new int[temp2.length];
            int idx = 0;
            for (int i = 0; i < temp2.length; i++) {
                if (temp2[i] != toRemove) {
                    withoutFive[idx++] = temp2[i];
                }
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(withoutFive[i] + " ");
            }
            System.out.println();

            System.out.println("Задание 39: Сравнение двух приоритетных массивов");
            String[] pq1 = {"A", "B", "C"};
            String[] pq2 = {"A", "B", "C"};
            boolean same = true;
            if (pq1.length != pq2.length) same = false;
            else {
                for (int i = 0; i < pq1.length; i++) {
                    if (!pq1[i].equals(pq2[i])) {
                        same = false;
                        break;
                    }
                }
            }
            System.out.println("Очереди одинаковы: " + same);

            System.out.println("Задание 40: Получить первый элемент очереди");
            System.out.println("Первый элемент: " + pq1[0]);

            System.out.println("Задание 41: Удалить и вернуть первый элемент");
            String[] newPQ = new String[pq1.length - 1];
            for (int i = 1; i < pq1.length; i++) {
                newPQ[i - 1] = pq1[i];
            }
            System.out.println("Удаленный: " + pq1[0]);

            System.out.println("Задание 42: Очередь в массив");
            for (int i = 0; i < newPQ.length; i++) {
                System.out.println("Элемент: " + newPQ[i]);
            }

            System.out.println("Задание 43: Очередь как строка");
            String queueString = "";
            for (int i = 0; i < newPQ.length; i++) {
                queueString += newPQ[i];
                if (i != newPQ.length - 1) queueString += ", ";
            }
            System.out.println("Строка: [" + queueString + "]");

            System.out.println("Задание 44: Максимальная очередь");
            int[] maxPQ = {3, 9, 7, 5};
            for (int i = 0; i < maxPQ.length - 1; i++) {
                for (int j = i + 1; j < maxPQ.length; j++) {
                    if (maxPQ[i] < maxPQ[j]) {
                        int tmp = maxPQ[i];
                        maxPQ[i] = maxPQ[j];
                        maxPQ[j] = tmp;
                    }
                }
            }
            for (int i = 0; i < maxPQ.length; i++) {
                System.out.print(maxPQ[i] + " ");
            }
            System.out.println();

            System.out.println("Задание 45: Map содержит ключ");
            String[][] map = {{"key1", "val1"}, {"key2", "val2"}};
            boolean hasKey = false;
            for (int i = 0; i < map.length; i++) {
                if ("key2".equals(map[i][0])) {
                    hasKey = true;
                    break;
                }
            }
            System.out.println("Содержит key2: " + hasKey);

            System.out.println("Задание 46: Map содержит значение");
            boolean hasValue = false;
            for (int i = 0; i < map.length; i++) {
                if ("val2".equals(map[i][1])) {
                    hasValue = true;
                    break;
                }
            }
            System.out.println("Содержит val2: " + hasValue);

            System.out.println("Задание 47: Просмотр пар ключ-значение");
            for (int i = 0; i < map.length; i++) {
                System.out.println(map[i][0] + " => " + map[i][1]);
            }

            System.out.println("Задание 48: Получить значение по ключу");
            String val = null;
            for (int i = 0; i < map.length; i++) {
                if ("key2".equals(map[i][0])) {
                    val = map[i][1];
                    break;
                }
            }
            System.out.println("Значение key2: " + val);

            System.out.println("Задание 49: Ключи из map");
            for (int i = 0; i < map.length; i++) {
                System.out.println("Ключ: " + map[i][0]);
            }

            System.out.println("Задание 50: Значения из map");
            for (int i = 0; i < map.length; i++) {
                System.out.println("Значение: " + map[i][1]);
            }

            System.out.println("Задание 51: Ключи в диапазоне [3, 7)");
            int[] keys = {1, 3, 5, 7, 9};
            String[] values = {"A", "B", "C", "D", "E"};
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] >= 3 && keys[i] < 7) {
                    System.out.println("key: " + keys[i] + ", value: " + values[i]);
                }
            }

            System.out.println("Задание 52: Ключи в диапазоне [3, 7]");
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] >= 3 && keys[i] <= 7) {
                    System.out.println("key: " + keys[i] + ", value: " + values[i]);
                }
            }

            System.out.println("Задание 53: Ключи >= 5");
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] >= 5) {
                    System.out.println("key: " + keys[i] + ", value: " + values[i]);
                }
            }

            System.out.println("Задание 54: Ключи > 5");
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] > 5) {
                    System.out.println("key: " + keys[i] + ", value: " + values[i]);
                }
            }

            System.out.println("Задание 55: Пара с наименьшим ключом >= 6");
            boolean found55 = false;
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] >= 6) {
                    System.out.println("key: " + keys[i] + ", value: " + values[i]);
                    found55 = true;
                    break;
                }
            }
            if (!found55) {
                System.out.println("Нет подходящей пары");
            }

            System.out.println("Задание 56: Наименьший ключ >= 6");
            boolean found56 = false;
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] >= 6) {
                    System.out.println("Ключ: " + keys[i]);
                    found56 = true;
                    break;
                }
            }
            if (!found56) {
                System.out.println("Такого ключа нет");
            }
        }
    }
}
