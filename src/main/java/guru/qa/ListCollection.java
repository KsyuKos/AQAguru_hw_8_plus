package guru.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCollection {

    private final ArrayList<String> arrayList = new ArrayList<>();

    public void addEl(String el) {
        arrayList.add(el);
    }

    public void addElAll(String[] elements) {
        arrayList.addAll(Arrays.asList(elements));
    }

    public void searchEl(String el) {
        if (arrayList.contains(el)) {
            System.out.println(el);
        } else System.out.println("Элемент не найден");
    }

    public void printArr() {
        System.out.println(arrayList);
    }

    public void printHashCode() {
        System.out.println(arrayList.hashCode());
    }

    public void compareHash(ListCollection arr1, ListCollection arr2) {
        int arr1HashCode = arr1.hashCode();
        int arr2HashCode = arr2.hashCode();
        if (arr1HashCode != arr2HashCode) {
            System.out.println("Хэшкод массива 1 " + arr1HashCode + " и хэшкод массива 2 " + arr2HashCode + " не равны");
        } else
            System.out.println("Хэшкод массива 1 " + arr1HashCode + " и хэшкод массива 2 " + arr2HashCode + " равны");
    }

    public void makeNoticed (String str) {
        int index = 0;
        while (index < arrayList.size()) {
            if (arrayList.get(index).contains(str)) {
                arrayList.set(index,arrayList.get(index) + "+1");
                System.out.println("Сделано");
            }
            index++;
        }
    }

    public void clearArr() {
        arrayList.clear();
    }

}
