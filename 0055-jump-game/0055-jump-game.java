class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        int index = 0, covered = nums[0];

        for(int i=1;i<nums.length;i++){
            if(covered >= nums.length-1) return true;
            if(covered >= i){
                covered = Math.max(covered, i+nums[i]);
            }
            else return false;
        }
        return true;
    }
}