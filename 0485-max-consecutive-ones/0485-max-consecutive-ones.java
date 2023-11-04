class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) ct++;
            else{
                System.out.println(ct+"  "+max);
                if(ct > max)
                    max = ct;
                ct=0;
            }
        }
        return (max>ct)?max:ct;
    }
}