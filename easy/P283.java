package sm;

import java.util.Arrays;

public class P283 {

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println("==>"+Arrays.toString(nums));
	}
	
	public static void moveZeroes(int[] nums) {
			int zero_ct=0;
			for(int i=0;i<nums.length;i++){
	                if(nums[i]==0){
	                	zero_ct++;}
	                else {
	                  nums[i-zero_ct] = nums[i];
		            System.out.println("-->"+Arrays.toString(nums));

	            }
	            System.out.println(Arrays.toString(nums));
	        }
			
			for(int i=zero_ct;i>0;i--) {
				nums[nums.length-i]=0;
			}
		
	}
}
