package com.codekedos.learning.search;


public class Main {
    public static void main(String[] args) {
        Searching searcObject = new Searching();

        int[] array = {10, 20, 30, 40, 50, 45, 25, 90};

        int index1 = searcObject.linearSearch(array, 30);
        System.out.println("Linear Search: 30 found at index " + index1);

        int index2 = searcObject.binarySearch(array, 40);
        System.out.println("Binary Search: 40 found at index " + index2);

        int index3 = searcObject.binarySearch(array, 5);
        System.out.println("Binary Search: 5 found at index " + index3);
    }
}
