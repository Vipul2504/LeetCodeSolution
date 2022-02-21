/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majour = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                majour = nums[i];
            } else if (majour == nums[i]) {
                count--;
            } else
                count++;
        }
        return majour;
    }
}
// @lc code=end
