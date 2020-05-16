package lesson1.homework;

// Написать метод, который меняет два элемента массива местами
// (массив может быть любого ссылочного типа);

import java.util.Arrays;

public class Task1 {

    String name;

    public Task1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Integer[] iNums = {10, 15, 20, 30, 100, 150};
        Double[] dNums = {11.1, 12.2, 13.3, 14.4, 15.5, 16.6};
        Float[] fNums = {21.1f, 22.2f, 23.3f, 24.4f, 25.5f, 26.6f};
        String[] sNums = {"Abcd", "efgh", "ijkl", "mnop", "qrst", "uvw", "xyz"};
        Task1[] tasks  = {new Task1("aaa"), new Task1("bbb"), new Task1("ccc"), new Task1("ddd")};

        printResults(iNums, dNums, fNums, sNums, tasks);
    }

    static <T> void swapElements(T[] array) {
        T arrayElement = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = arrayElement;
        System.out.println(Arrays.toString(array));
    }

    private static void printResults(Integer[] iNums, Double[] dNums, Float[] fNums, String[] sNums, Task1[] tasks) {
        System.out.println("Массивы до замены:");
        System.out.println(Arrays.toString(iNums));
        System.out.println(Arrays.toString(dNums));
        System.out.println(Arrays.toString(fNums));
        System.out.println(Arrays.toString(sNums));
        System.out.println(Arrays.toString(tasks));
        System.out.println("--------------------------------------------------------");
        System.out.println("Массивы после смены мест первого и последнего элементов:");
        swapElements(iNums);
        swapElements(dNums);
        swapElements(fNums);
        swapElements(sNums);
        swapElements(tasks);
    }

}
