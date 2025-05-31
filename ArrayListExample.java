package day23;

import java.lang.reflect.Array;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Initialize an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry"); // Adding at specific index
        System.out.println("After adding elements: " + list);

        // Adding another collection
        List<String> moreFruits = Arrays.asList("Mango", "Orange");
        list.addAll(moreFruits);
        System.out.println("After addAll: " + list);

        // Getting an element
        System.out.println("Element at index 2: " + list.get(2));

        // Checking index of an element
        System.out.println("Index of 'Banana': " + list.indexOf("Banana"));

        // Checking if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Checking if list contains an element
        System.out.println("Does list contain 'Cherry'? " + list.contains("Cherry"));

        // Finding last index of an element
        System.out.println("Last index of 'Mango': " + list.lastIndexOf("Mango"));

        // Removing elements
        list.remove(3); // Remove element at index
        list.remove("Apple"); // Remove specific element
        System.out.println("After removal: " + list);

        // Removing a collection
        list.removeAll(Arrays.asList("Banana", "Cherry"));
        System.out.println("After removeAll: " + list);

        // Retaining certain elements
        list.retainAll(Arrays.asList("Mango", "Orange"));
        System.out.println("After retainAll: " + list);

        // Setting a new value at an index
        list.set(0, "Strawberry");
        System.out.println("After setting element at index 0: " + list);

        // Checking size of list
        System.out.println("Size of list: " + list.size());

        // Getting a sublist
        List<String> subList = list.subList(0, 1);
        System.out.println("Sublist: " + subList);

        // Clearing the list
        list.clear();
        System.out.println("After clear: " + list);
    }
}


