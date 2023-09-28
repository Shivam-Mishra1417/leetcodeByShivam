class Solution {
    public int findMin(int[] nums) {
  return bs(nums, 0, nums.length-1);
	  }
	 
	 public static int bs(int[] arr, int l, int r) {
		 
		 while(l<r) {
			 int m = l+(r-l)/2;
			 
			 if(arr[m] > arr[r])
			 {
				 l = m+1;
				 
			 }
			 else {
				 r = m;
			 }
		 }
		 
		 return arr[l];
	 }

}