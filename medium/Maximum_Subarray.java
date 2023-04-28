package medium;
//https://leetcode.com/problems/maximum-subarray/
public class Maximum_Subarray {
	class Solution {
	    public int maxSubArray(int[] nums) {
	        
	      int csum=nums[0],maxsum=csum;
	        if(nums.length ==1)
	            return nums[0];
	        else
	        for(int i=1; i<nums.length;i++){
	            if(csum < 0)
	                csum = nums[i];
	            else{
	                csum+=nums[i];  
	            }
	            if(csum > maxsum)
	                maxsum = csum;
	        }
	        
	        return maxsum;
	    }
	}
}
