import java.util.Arrays;

/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] array = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(array, (String s1, String s2) -> (s2 + s1).compareTo(s1 + s2));
        return Arrays.stream(array).reduce((x, y) -> x.equals("0") ? y : x + y).get();
    }
}
// @lc code=end
