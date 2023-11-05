class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        boolean flag = false, up=false;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(flag && nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    up= true;
                    break;
                }
                if(nums2[j] == nums1[i])
                    flag = true;   
            }
            if(!up)
            res[i] = -1;
            flag = false;
            up=false;
        }
        return res;
    }
}