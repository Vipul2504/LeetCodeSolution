/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0, altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            if (altitude > highest) {
                highest = altitude;
            }
        }
        return highest;
    }
}
// @lc code=end
