// Problem: Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Difficulty: Easy
// Approach: In-place marking (optimal, O(1) extra space)

import java.util.*;

public class FindAllNumbersDisappeared_InPlace {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Step 1: Mark indices corresponding to numbers
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Step 2: Collect missing numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappeared_InPlace solver = new FindAllNumbersDisappeared_InPlace();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(solver.findDisappearedNumbers(nums)); // [5,6]
    }
}
