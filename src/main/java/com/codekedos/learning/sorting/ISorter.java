package com.codekedos.learning.sorting;

public interface ISorter {
    void sort(int[] array);

    // Utility method to print array
    default void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
