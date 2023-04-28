package medium;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int[] res = new int[2];
	        res[0] = -1;
	        res[1] = -1;
	        if(nums.length == 0){
	            return res;
	        }
	        if(nums.length == 1){
	            if(nums[0] == target){
	                res[0] = 0;
	                res[1] = 0;
	                return res;
	            }
	            return res;
	        }
	        res[0] = leftSimpleBinary(nums,0, nums.length-1,target);
	        res[1] = rightSimpleBinary(nums,0, nums.length-1,target);
	        return res;
	    }

	     public int leftSimpleBinary(int [] arr, int l, int r,int t){
	        if(l>r) return -1;
	        int m = l+ (r-l)/2 ;
	        System.out.println("lsb: "+l+" "+m+" "+r);
	        
	        if(arr[m] == t)
	            if( m==0)
	            return m;
	            else if (arr[m-1]!=t)
	            return m;

	        
	        if(arr[m] >= t)
	            return leftSimpleBinary(arr, l,m-1,t);
	        else
	            return leftSimpleBinary(arr,m+1,r,t);
	    }

	    public int rightSimpleBinary(int [] arr, int l, int r,int t){
	        if(l>r) return -1;
	        int m = l+ (r-l)/2 ;
	        System.out.println("rsb : "+l+" "+m+" "+r);
	        
	        if(arr[m] == t)
	        if(m== arr.length-1)
	            return m;
	        else if(arr[m+1]!=t)
	            return m;
	        
	        if(arr[m] <= t)
	            return rightSimpleBinary(arr,m+1,r,t);
	        else
	            return rightSimpleBinary(arr, l,m-1,t);
	    }
	}
}
