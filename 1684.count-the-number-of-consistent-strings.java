import java.util.Arrays;

/*
 * @lc app=leetcode id=1684 lang=java
 *
 * [1684] Count the Number of Consistent Strings
 */

// @lc code=start
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // return Arrays.stream(words)
        // .mapToInt(w -> w.chars().allMatch(c -> allowed.contains((char) c + "")) ? 1 :
        // 0)
        // .sum();
        int alphabet = 0, cnt = 0;
        for (int i = 0; i < allowed.length(); ++i) {
            int shift = allowed.charAt(i) - 'a';
            alphabet |= 1 << shift;
        }
        outer: for (String w : words) {
            for (int i = 0; i < w.length(); ++i) {
                if ((alphabet & (1 << w.charAt(i) - 'a')) == 0) {
                    continue outer;
                }
            }
            ++cnt;
        }
        return cnt;
    }
}
// @lc code=end
