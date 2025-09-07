// Problem: Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Difficulty: Easy
// Approach: HashSet (easy optimized method)

import java.util.*;

public class FindAllNumbersDisappeared_HashSet {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        // Step 1: Add all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Check which numbers are missing
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappeared_HashSet solver = new FindAllNumbersDisappeared_HashSet();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(solver.findDisappearedNumbers(nums)); // [5,6]
    }
}
