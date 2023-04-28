package medium;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Search_in_Rotated_Sorted_Array {
	class Solution {
	    public int search(int[] nums, int target) {
	        int x=-1;
	        if(nums.length==1 && nums[0]==target)
	        return 0;
	        else{
	            if(nums[0] < nums[nums.length - 1])
	               x =  simpleBinary(nums,0,nums.length-1,target);
	             else
	               x =  rotatedBinary(nums,0,nums.length-1,target)   ;
	        }
	   //int x=  binary(nums,0,nums.length-1,target);
	   return x;
	    }
	    public int simpleBinary(int [] arr, int l, int r,int t){
	        if(l>r) return -1;
	        int m = l+ (r-l)/2 ;

	        if(arr[m] == t)
	            return m;
	        
	        if(arr[m] > t)
	            return simpleBinary(arr, l,m-1,t);
	        else
	            return simpleBinary(arr,m+1,r,t);
	    }





	    public int rotatedBinary(int [] arr, int l, int r,int t){
	        //System.out.println(l+" "+r);
	        int m = l+((r-l)/2);
	          System.out.println(l+" "+m+" "+r);
	        if (l>r) return -1;
	        if(arr[m]==t)
	            return m;
	        if(arr[m]  >=  arr[l]){
	            if(t< arr[m]){
	                if(t>=arr[l])
	                    return rotatedBinary(arr,l,m-1,t);
	                else
	                     return rotatedBinary(arr,m+1,r,t);    
	            }
	            else
	             return rotatedBinary(arr,m+1,r,t);
	        }
	        else{
	            if(t>=arr[l])
	               return rotatedBinary(arr,l,m-1,t);
	            if(t<arr[m])
	                return rotatedBinary(arr,l,m-1,t);  
	            else
	                return rotatedBinary(arr,m+1,r,t);    



	        }

	            

	    }
	}
}
