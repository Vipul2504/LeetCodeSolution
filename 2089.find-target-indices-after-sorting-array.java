/*
 * @lc app=leetcode id=2089 lang=java
 *
 * [2089] Find Target Indices After Sorting Array
 */

// @lc code=start
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                ans.add(i);
        }
        return ans;
    }
}
// @lc code=end
