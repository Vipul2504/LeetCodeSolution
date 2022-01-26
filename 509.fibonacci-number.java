/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int num) {
        if (num <= 1)
            return num;
        else
            return fib(num - 1) + fib(num - 2);
    }
}
// @lc code=end
