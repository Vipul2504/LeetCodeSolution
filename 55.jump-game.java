/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(A[i] + i, max);
        }
        return true;
    }
}
// @lc code=end
