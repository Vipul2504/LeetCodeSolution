/*
 * @lc app=leetcode id=1009 lang=java
 *
 * [1009] Complement of Base 10 Integer
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int n) {
        return n == 0 ? 1 : ((1 << Integer.toBinaryString(n).length()) - 1) ^ n;
    }
}
// @lc code=end
