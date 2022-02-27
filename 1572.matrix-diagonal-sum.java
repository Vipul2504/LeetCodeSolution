/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum = sum + mat[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][n - 1 - i];
        }
        if (n % 2 != 0) {
            sum = sum - mat[n / 2][n / 2];
        }
        return sum;
    }
}
// @lc code=end
