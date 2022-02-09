/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] A) {
        // int dupes = 0;
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == nums[i - 1]) {
        // dupes++;
        // }
        // nums[i - dupes] = nums[i];
        // }
        // return nums.length - dupes;
        if (A.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] != A[j])
                A[++j] = A[i];
        return ++j;
    }
}
// @lc code=end
