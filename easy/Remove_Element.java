package easy;
//https://leetcode.com/problems/remove-element/
public class Remove_Element {
	class Solution {
	    public int removeElement(int[] nums, int val) {
	        int i=0,k=0,ct=0;
	        int pointer = nums.length-1;
	        
	        while(ct<nums.length && pointer>=0){
	            if(nums[i] != val)
	            {   
	                if(nums[i]!=51)k++;
	                i++;
	            }
	            else{
	                int t = nums[pointer];
	                nums[pointer] = 51;
	                nums[i] = t;
	                pointer--;
	            }
	            ct++;
	       //   System.out.println(Arrays.toString(nums));
	        }
	      //  System.out.println(">>"+k+" >>"+pointer);
	        return k;
	    }
	}
}
