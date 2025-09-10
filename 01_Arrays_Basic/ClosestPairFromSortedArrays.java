// ✅ Problem: Find the Closest Pair from Two Sorted Arrays
// Link: https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays/0
// Difficulty: Medium
// Approach: Two-Pointer (O(N + M))

import java.util.*;

class Solution {
    // Function for finding closest pair
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        int i = 0;         // start of arr
        int j = m - 1;     // end of brr
        int closestDiff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && j >= 0) {
            int sum = arr[i] + brr[j];
            int diff = Math.abs(sum - x);

            if (diff < closestDiff) {
                closestDiff = diff;
                result.clear();
                result.add(arr[i]);
                result.add(brr[j]);
            }

            if (sum < x) {
                i++;   // need bigger sum
            } else {
                j--;   // need smaller sum
            }
        }
        return result;
    }
}
