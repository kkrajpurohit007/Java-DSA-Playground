package com.codekedos.learning.sorting;

import com.codekedos.learning.sorting.impl.BubbleSort;
import com.codekedos.learning.sorting.impl.InsertionSort;
import com.codekedos.learning.sorting.impl.SelectionSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();

        // Valid case
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        sorter.printArray(numbers);
        sorter.sort(numbers);
        System.out.println("Sorted Array (Bubble Sort):");
        sorter.printArray(numbers);

        // Invalid case
        int[] invalidArray = {42};
        try {
            sorter.sort(invalidArray);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=====================");
        SelectionSort sorter2 = new SelectionSort();

        // Valid case
        int[] numbers2 = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        sorter2.printArray(numbers2);
        sorter2.sort(numbers2);
        System.out.println("Sorted Array (Selection Sort):");
        sorter2.printArray(numbers2);

        // Invalid case
        int[] invalidArray2 = {};
        try {
            sorter2.sort(invalidArray2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=============");
        InsertionSort sorter3 = new InsertionSort();
        int[] numbers3 = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        sorter3.printArray(numbers3);
        sorter3.sort(numbers3);
        System.out.println("Sorted Array (Insertion Sort):");
        sorter3.printArray(numbers3);
        int[] invalidArray3 = {};
        try {
            sorter3.sort(invalidArray3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}