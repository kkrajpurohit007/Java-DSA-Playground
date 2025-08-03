package com.codekedos.learning.sorting;

import com.codekedos.learning.sorting.impl.BubbleSort;

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
    }
}