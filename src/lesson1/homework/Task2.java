package lesson1.homework;

//Написать метод, который преобразует массив в ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {

    String name;

    public Task2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "name='" + name + '\'' +
                '}';
    }

    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> newList = new ArrayList<>();
        Collections.addAll(newList, array);

        return newList;
    }

    public static void main(String[] args) {
        Integer[] iNums = {10, 15, 20, 30, 100, 150};
        Double[] dNums = {11.1, 12.2, 13.3, 14.4, 15.5, 16.6};
        Float[] fNums = {21.1f, 22.2f, 23.3f, 24.4f, 25.5f, 26.6f};
        String[] sNums = {"Abcd", "efgh", "ijkl", "mnop", "qrst", "uvw", "xyz"};
        Task2[] tasks  = {new Task2("aaa"), new Task2("bbb"), new Task2("ccc"), new Task2("ddd")};

        System.out.println(arrayToList(iNums));
        System.out.println(arrayToList(dNums));
        System.out.println(arrayToList(fNums));
        System.out.println(arrayToList(sNums));
        System.out.println(arrayToList(tasks));
    }
}
