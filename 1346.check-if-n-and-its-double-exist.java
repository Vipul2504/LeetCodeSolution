import java.util.HashSet;

/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(a * 2) || (a % 2 == 0 && set.contains(a / 2)))
                return true;
            set.add(a);
        }
        return false;
    }
}
// @lc code=end
