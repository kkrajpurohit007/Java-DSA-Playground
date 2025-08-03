package com.codekedos.learning.sorting.impl;

import com.codekedos.learning.sorting.ISorter;

public class BubbleSort implements ISorter {

    @Override
    public void sort(int[] array) {
        // array validation
        if(array == null || array.length < 2){
            throw new IllegalArgumentException("Array must have at least 2 elements to sort.");
        }
        // Iteration
        for(int i = 0; i < array.length - 1 ; i++){
            for(int j = 0; j < array.length - i -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
