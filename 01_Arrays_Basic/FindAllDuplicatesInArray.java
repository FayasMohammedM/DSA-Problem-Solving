/**
 * Problem: 442. Find All Duplicates in an Array
 * Difficulty: Easy
 * 
 * Given an integer array nums where each integer appears once or twice,
 * return a list of all integers that appear twice.
 *
 * Constraints:
 * - Must run in O(n) time and O(1) extra space (excluding output list)
 *
 * Approach (Sign-marking):
 * 1. Iterate through the array.
 * 2. For each number 'num', map it to index 'num - 1'.
 * 3. If nums[index] is negative → number already seen → add to result.
 * 4. Else, flip nums[index] to negative to mark as seen.
 * 5. Return the result list.
 *
 * Complexity:
 * Time: O(n)
 * Space: O(1) (ignoring output list)
 */

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num - 1;
            
            if (nums[index] < 0) {
            
                result.add(num);
            } else {
               
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }
}
