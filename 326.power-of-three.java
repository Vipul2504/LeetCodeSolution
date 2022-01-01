/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        long num = 1;
        while (num < n) {
            num *= 3;
        }
        return num == n;
    }
}
// @lc code=end
