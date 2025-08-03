package com.codekedos.learning.sorting.impl;

import com.codekedos.learning.sorting.ISorter;

public class SelectionSort implements ISorter {
    @Override
    public void sort(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is null or empty.");
        }
        if (arr.length == 1){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
