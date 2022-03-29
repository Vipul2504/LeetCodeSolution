/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        if (s == null)
            return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
// @lc code=end
