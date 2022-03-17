/*
 * @lc app=leetcode id=1784 lang=java
 *
 * [1784] Check if Binary String Has at Most One Segment of Ones
 */

// @lc code=start
class Solution {
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') { // found "01".
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
