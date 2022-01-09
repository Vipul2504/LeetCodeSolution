/*
 * @lc app=leetcode id=754 lang=java
 *
 * [754] Reach a Number
 */

// @lc code=start
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}
// @lc code=end
