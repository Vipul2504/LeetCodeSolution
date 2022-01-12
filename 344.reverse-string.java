/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public String reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){    //Do it half the number of String length
            char tmp = s[i];
            s[i] = s[s.length-1-i];     //Front swap with other End side 
            s[s.length-1-i] = tmp;      
    }
}
// @lc code=end
