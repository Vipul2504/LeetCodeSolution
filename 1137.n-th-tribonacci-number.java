/*
 * @lc app=leetcode id=1137 lang=java
 *
 * [1137] N-th Tribonacci Number
 */

// @lc code=start
class Solution {
    public int tribonacci(int n) {
        // int[] trib = new int[n + 3];
        // trib[0] = 0;
        // trib[1] = trib[2] = 1;

        // for (int i = 3; i <= n; i++) {

        // trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3];

        // }
        // return trib[n];

        if (n < 2)
            return n;
        int a = 0, b = 1, c = 1, d;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
// @lc code=end
