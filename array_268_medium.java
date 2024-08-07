// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.



class Solution {
    public int missingNumber(int[] nums) {
        int numsLength = nums.length;
        int i = 0;
        while (i < numsLength) {
            int valAtI = nums[i];
            boolean belongsInRange = valAtI < numsLength;

            if (belongsInRange && valAtI != nums[valAtI]) {
                int temp = nums[i];
                nums[i] = nums[valAtI];
                nums[valAtI] = temp;
            } else {
                i++;
            }
        }

        for (int x = 0; x < numsLength; x++) {
            if (x != nums[x]) {
                return x;
            }
        }
        return numsLength;
    }
}