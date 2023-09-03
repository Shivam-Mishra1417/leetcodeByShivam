package sm;

import java.util.Arrays;

public class P1608 {
	public static void main(String[] args) {
		int[] arr = {0,4,0,3,4};
		
		System.out.println(specialArray(arr));
		}
	  
	
//	 public static int specialArray(int[] nums) {
//		 int res=-1;
//		 Arrays.sort(nums);
//		 int ct=0;
//		 for(int i=0;i<nums.length;i++) {
//			 if(nums[i]>ct)
//				 ct++;
//			 }
//		 
//		 return ct;
//		 
//	 }
	 public static int specialArray(int[] nums) {
	        int res=-1;
	        Arrays.sort(nums);
	        System.out.println(Arrays.toString(nums));
	        for(int i=1;i<nums.length;i++) {
	        	for(int j=0;j<nums.length;j++) {
	        		if(nums[j]>=i && nums.length - j == i) {
		        		return i;
		        	}
	        	}
	        	
	        }
	        
	        return res;
	    }
}
