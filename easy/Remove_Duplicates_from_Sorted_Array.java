package easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Remove_Duplicates_from_Sorted_Array {

	class Solution {
	    public int removeDuplicates(int[] nums) {
	        
	        int k=1,i=1,pointer = 0;
	        
	        while(i<nums.length){
	            //System.out.println("k="+k+"  i="+i+"  ct="+ct+"   pointer="+pointer);
	            if(nums[i] <= nums[pointer])
	                i++;
	            else{
	                pointer++;
	                int t = nums[i];
	                nums[i] = nums[pointer];
	                nums[pointer]=t;
	                i++;
	                
	                k++;
	            }
	            
	            
	            //System.out.println("Araay is >> "+Arrays.toString(nums));
	        }
	        
	        return k;
	    }
	}
}
