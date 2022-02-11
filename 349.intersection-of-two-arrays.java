import java.util.HashSet;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < nums1.length; i = i + 1) {
            for (int j = 0; j < nums2.length; j = j + 1) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int arr[] = new int[set.size()];
        int j = 0;
        for (int i : set) {
            arr[j++] = i;
        }
        return arr;
    }
}
// @lc code=end
