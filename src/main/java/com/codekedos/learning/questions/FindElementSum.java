package com.codekedos.learning.questions;

import java.util.Arrays;

public class FindElementSum {

    public int[] findElement(int[] arr, int sum){
        int[] resultArr = new int[2];
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int res = arr[low] + arr[high];
            if(res == sum){
                resultArr[0] = low;
                resultArr[1] = high;
                break;
            } else if(res > sum){
                high = high - 1;
            } else {
                low = low + 1;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println("Find element whoes sum is <X>");
        FindElementSum sol = new FindElementSum();
        int[] arr = {2,5,9,11,14,16,19,20};
        int[] res = sol.findElement(arr, 31);
        System.out.println(Arrays.toString(res));
    }
}
