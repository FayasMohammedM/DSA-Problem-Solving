import java.util.Arrays;

class Solution {
    /**
     * Problem: 3Sum Closest
     * -----------------------------------
     * Given an integer array nums of length n and an integer target, 
     * find three integers in nums such that the sum is closest to target.
     *
     * Approach:
     * 1. Sort the array to enable two-pointer technique.
     * 2. Fix one number (nums[i]) and then use two pointers (left, right) 
     *    to find the closest sum of the other two numbers.
     * 3. Keep track of the closest sum found so far.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // initialize with first 3 elements

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                
                if (sum < target) {
                    left++; // need a bigger sum
                } else if (sum > target) {
                    right--; // need a smaller sum
                } else {
                    return sum; // exact match found
                }
            }
        }
        return closestSum;
    }
}
