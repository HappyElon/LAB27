package ru.mirea.LAB27.task4;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Element1");
        set.add("Element3");
        set.add("Element2");
        set.add("Element5");
        set.add("Element4");
        set.add("Element8");
        set.add("Element6");
        set.add("Element7");
        set.add("Element10");
        set.add("Element9");

        System.out.println("Set elements: " + set);

        String elementToCheck = "Element3";
        if (set.contains(elementToCheck)) {
            System.out.println("Set contains " + elementToCheck);
        } else {
            System.out.println("Set does not contain " + elementToCheck);
        }

        String elementToRemove = "Element6";
        set.remove(elementToRemove);
        System.out.println("Removed element: " + elementToRemove);

        System.out.println("Updated set elements: " + set);
    }
}

