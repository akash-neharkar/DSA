// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.

// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

// Example 1:

// Input: left = 1, right = 22
// Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]



class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        int n1=left,n2=right;
        for(int i=left;i<=right;i++){
            if(check(i))
            list.add(i);
        }
        return list;
    }
    public boolean check(int n){
        int digit=n;
        while(n>0){
            int div=n%10;
            if(div==0) return false;
            if(digit%div != 0) return false;
            n=n/10;
        }
        return true;
    }
}