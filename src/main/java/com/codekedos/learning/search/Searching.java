package com.codekedos.learning.search;

public class Searching implements ISearch {

    @Override
    public int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty.");
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arr, int target) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is null or empty.");
        }
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int midIndex = (left + (right-left))/2;
            if(arr[midIndex] == target){
                return midIndex;
            } else if(arr[midIndex] > target){
                right = midIndex - 1;
            } else if(arr[midIndex] < target){
                left = midIndex + 1;
            }
        }
        return -1;
    }
}
