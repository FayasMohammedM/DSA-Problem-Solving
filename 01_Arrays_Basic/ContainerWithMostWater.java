/**
 * 11. Container With Most Water
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn 
 * such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the 
 * container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 * 2 <= height.length <= 10^5
 * 0 <= height[i] <= 10^4
 *
 * Approach:
 * - Two-pointer technique (left, right)
 * - Compute area using min(height[left], height[right]) * (right - left)
 * - Move the pointer at the smaller height inward
 * - Time: O(n), Space: O(1)
 */
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea,
                    Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
