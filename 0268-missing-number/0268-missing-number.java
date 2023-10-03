class Solution {
    public int missingNumber(int[] nums) {
         int l = nums.length;
        int sum=(l*(l+1))/2;
        for(int x:nums)
        sum-=x;
       
        return sum;
    }
}