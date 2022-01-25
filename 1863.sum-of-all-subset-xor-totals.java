/*
 * @lc app=leetcode id=1863 lang=java
 *
 * [1863] Sum of All Subset XOR Totals
 */

// @lc code=start
class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res |= num;
        }
        return res * (1 << nums.length - 1);
    }
}
// @lc code=end
