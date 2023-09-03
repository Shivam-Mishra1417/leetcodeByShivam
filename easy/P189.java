package sm;

import java.util.Arrays;

public class P189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8};
		rotate(nums,3);
	}
	
	  public static void rotate(int[] nums, int k) {
		  int index=0;
		  for(int j=0;j<k;j++) {
		  for(int i=nums.length-k;i<nums.length && index<nums.length-1;i++) {
			  int tmp = nums[i];
			  nums[i] = nums[index];
			  nums[index] = tmp;
			  index++;
		  }
		  System.out.println(index);
		  System.out.println(Arrays.toString(nums));
		  
		  } 
	  }
	
//	 public static void rotate(int[] nums, int k) {
//	        int[] new_nums = new int[nums.length];
//	       if(k>nums.length)
//	       k = k%nums.length;
//	         for(int i=0;i<k;i++){
//	             new_nums[i] = nums[nums.length-k+i];
//	         }
//	         
//	        for( int i=0;i<nums.length-k;i++){
//	           new_nums[k+i] = nums[i];
//	    }
//	       for(int i=0;i<nums.length;i++)
//	         nums[i]= new_nums[i];
//	         System.out.println(Arrays.toString(nums));
//	     }
}
