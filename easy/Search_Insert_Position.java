package easy;
//https://leetcode.com/problems/search-insert-position/
public class Search_Insert_Position {
	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        
	        if(target<nums[0])
	            return 0;
	        if(target > nums[nums.length-1]) 
	            return nums.length;   

	        int x = binarySearch(nums,0,nums.length-1,target);
	        return x;
	    }


	    public int binarySearch(int [] arr,int l, int r, int t){

	        int m = l + (r-l)/2;
	        System.out.println(l+" "+m+" "+r);
	        if(arr[m] == t)
	            return m;
	        if(m>0) {  
	        if(arr[m-1]<t && arr[m]>t)
	        return m;
	        }
	     
	        if(t>arr[m]){
	                return binarySearch(arr,m+1,r,t);
	        }
	        else
	                return binarySearch(arr,l,m-1,t);


	    }
	}

}
