package easy;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
import java.util.Arrays;
import java.util.HashMap;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
	static int[] nums = {8,1,2,2,3};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(nums));
	
	
	class Solution{
	    public int[] smallerNumbersThanCurrent(int[] nums) {
	        int[] result= new int[nums.length];
	        int[] copy = nums.clone();
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length;i++) {
	        	
	        	if(!map.containsKey(nums[i]))
	        		map.put(nums[i], i);
	        
	        }
	        //System.out.println(">>"+Arrays.toString(copy));
	        for(int i=0;i<nums.length;i++) {
	        	
	        	result[i] = map.get(copy[i]);
	        	
	        }
	       // System.out.println(map);
	     	return result;
	    }
	}
	
	Solution s  = new Solution();
	System.out.println(nums);
	
	int[] res = s.smallerNumbersThanCurrent(nums);
	System.out.println(Arrays.toString(res));
	}
}

