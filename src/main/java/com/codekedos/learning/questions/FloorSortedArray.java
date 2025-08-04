package com.codekedos.learning.questions;

public class FloorSortedArray {
    public int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1; // Store index of floor

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                result = mid;      // arr[mid] could be the floor, store its index
                low = mid + 1;     // But let's search further to the right for larger values <= x
            } else {
                high = mid - 1;    // arr[mid] > x, so discard right half
            }
        }
        return result; // -1 if no floor found
    }

    public static void main(String[] args) {
        FloorSortedArray sol = new FloorSortedArray();

        int[] arr1 = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(sol.findFloor(arr1, 5));   // ➤ 1
        System.out.println(sol.findFloor(arr1, 11));  // ➤ 4
        System.out.println(sol.findFloor(arr1, 0));   // ➤ -1
        System.out.println(sol.findFloor(arr1, 10));  // ➤ 4 (last occurrence)
        System.out.println(sol.findFloor(arr1, 19));  // ➤ 6
        System.out.println(sol.findFloor(arr1, 20));  // ➤ 6
    }
}
