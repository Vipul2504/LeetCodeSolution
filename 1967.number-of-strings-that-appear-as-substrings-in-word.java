/*
 * @lc app=leetcode id=1967 lang=java
 *
 * [1967] Number of Strings That Appear as Substrings in Word
 */

// @lc code=start
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end
