/**
 * Problem: 2215. Find the Difference of Two Arrays
 * Difficulty: Easy
 * 
 * Given two integer arrays nums1 and nums2, return a list answer of size 2 where:
 *  - answer[0] contains all distinct integers in nums1 that are not in nums2.
 *  - answer[1] contains all distinct integers in nums2 that are not in nums1.
 *
 * Approach:
 * 1. Use HashSet to remove duplicates and allow O(1) lookups.
 * 2. Convert nums1 and nums2 into sets (set1, set2).
 * 3. For nums1-exclusive elements: copy set1, remove all elements of set2.
 * 4. For nums2-exclusive elements: copy set2, remove all elements of set1.
 * 5. Return both lists inside a single result.
 *
 * Complexity:
 * Time: O(n + m) → where n = nums1.length, m = nums2.length
 * Space: O(n + m) → for the sets
 */

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Convert arrays to sets (remove duplicates automatically)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        
        // nums1-exclusive
        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        
        // nums2-exclusive
        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);
        
        return Arrays.asList(diff1, diff2);
    }
}
