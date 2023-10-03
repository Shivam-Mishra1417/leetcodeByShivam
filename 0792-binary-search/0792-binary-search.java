class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }

    public int bs(int[] nums, int t, int l, int r){
        if(l>r) return -1;

        int m = l + (r-l)/2;

        if(nums[m]==t) return m;

        if(nums[m] > t) return bs(nums, t,l, m-1);
        else return bs(nums,t, m+1,r);

    }
}