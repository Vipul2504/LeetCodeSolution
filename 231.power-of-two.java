/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        long num = 1;
        while (num < n) {
            num *= 2;

        }
        return num == n;
    }
}
// @lc code=end
