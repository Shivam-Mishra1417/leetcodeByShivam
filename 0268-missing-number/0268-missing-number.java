class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int x:nums)
        sum+=x;
        int l = nums.length;
        return (l*(l+1))/2-sum;
    }
}