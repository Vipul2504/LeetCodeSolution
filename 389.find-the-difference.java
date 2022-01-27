/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        // char c = 0;
        // for (int i = 0; i < s.length(); ++i) {
        // c ^= s.charAt(i);
        // }
        // for (int i = 0; i < t.length(); ++i) {
        // c ^= t.charAt(i);
        // }
        // return c;
        char[] chs = s.toCharArray(), cht = t.toCharArray();
        int sums = 0, sumt = 0;
        for (char c : chs)
            sums += (int) c;
        for (char c : cht)
            sumt += (int) c;
        return (char) (sumt - sums);
    }
}
// @lc code=end
