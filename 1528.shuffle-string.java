/*
 * @lc app=leetcode id=1528 lang=java
 *
 * [1528] Shuffle String
 */

// @lc code=start
class Solution {
    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for (int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
// @lc code=end
