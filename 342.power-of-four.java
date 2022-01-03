/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        long num = 1;
        while (num < n) {
            num *= 4;

        }
        return num == n;
    }
}
// @lc code=end
