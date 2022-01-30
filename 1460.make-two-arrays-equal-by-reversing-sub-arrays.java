/*
 * @lc app=leetcode id=1460 lang=java
 *
 * [1460] Make Two Arrays Equal by Reversing Sub-arrays
 */

// @lc code=start
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt = new int[1001];
        for (int t : target)
            ++cnt[t];
        for (int a : arr) {
            if (--cnt[a] < 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
