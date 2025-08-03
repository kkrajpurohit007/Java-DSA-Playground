package com.codekedos.learning.sorting.impl;

import com.codekedos.learning.sorting.ISorter;

public class InsertionSort implements ISorter {

    @Override
    public void sort(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is null or empty");
        }
        if (arr.length == 1){
            return;
        }
        for(int i = 1; i < arr.length - 1; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
