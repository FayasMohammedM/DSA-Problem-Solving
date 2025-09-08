// 🔹 Problem: 350. Intersection of Two Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/
//
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays.
//
// Example:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
//
// Approach:
// ✅ Use HashMap to count frequencies of nums1
// ✅ Traverse nums2 and match with map counts
// ✅ O(n + m) time complexity, O(min(n, m)) space

import java.util.*;

class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Match nums2 elements with map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
