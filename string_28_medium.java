// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.



class Solution {
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haylength-needlelength;i++){
            int j=0;
            while(j<needlelength && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needlelength){
                return i;
            }
        }
        return -1;
    }
}
