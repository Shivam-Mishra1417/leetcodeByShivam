package easy;
//https://leetcode.com/problems/find-pivot-index/
public class Find_Pivot_Index {
	class Solution {
	    public int pivotIndex(int[] nums) {
	        int pivot=-1,ls=0,rs=0;;
	for(int i=0;i<nums.length;i++){
	ls=0;rs=0;
	    for(int j=0;j<nums.length;j++){
	if(j<i) ls+=nums[j];
	else if(j>i) rs+=nums[j];
	    }
	    if (ls==rs){pivot=i;break;}
	}
	return pivot;
	    }
	}
}
