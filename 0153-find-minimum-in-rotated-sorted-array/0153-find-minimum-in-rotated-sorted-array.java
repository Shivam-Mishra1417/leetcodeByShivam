class Solution {
    public int findMin(int[] nums) {
  return bs(nums, 0, nums.length-1);
	  }
	 
	 public static int bs(int[] arr, int l, int r) {
		 
		 if(l>=r) return arr[l];
		 
		 int m = l + (r-l)/2;
		 
		 if(arr[r] < arr[m])
			 return bs(arr,m+1,r);
		 else
			 return bs(arr,l,m);
		 
	 }
}