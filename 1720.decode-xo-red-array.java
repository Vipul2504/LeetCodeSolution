/*
 * @lc app=leetcode id=1720 lang=java
 *
 * [1720] Decode XORed Array
 */

// @lc code=start
class Solution {
    public int[] decode(int[] A, int first) {
        int n = A.length, res[] = new int[n + 1];
        res[0] = first;
        for (int i = 0; i < n; ++i)
            res[i + 1] = res[i] ^ A[i];
        return res;
    }
}
// @lc code=end
