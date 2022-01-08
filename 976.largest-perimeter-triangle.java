import java.util.Arrays;

/*
 * @lc app=leetcode id=976 lang=java
 *
 * [976] Largest Perimeter Triangle
 */

// @lc code=start
class Solution {
    public int largestPerimeter(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = len - 1; i >= 2; i--) {
            if (isValid(nums[i], nums[i - 1], nums[i - 2]))
                return nums[i] + nums[i - 1] + nums[i - 2];
        }

        return 0;
    }

    // O(1) O(1)
    public boolean isValid(int a, int b, int c) {
        if (a + b <= c || b + c <= a || a + c <= b)
            return false;
        return true;
    }
}

// @lc code=end
