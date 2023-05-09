package easy;
//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
import java.util.ArrayList;
import java.util.Collections;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_digits {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.minimumSum(2932));
	}
	
}
class Solution {
    public int minimumSum(int num) {
        //first sort the digits in ascending order - a,b,c,d
        // to make 2 new numbers from set of 4 digits combine as ad, bc 
        // as we want lowest number to tens place and highest number at units place to make
        // smallest number
        
        ArrayList<Integer> l = new ArrayList<Integer>();        
        while(num>0){
           l.add(num%10);
            num = num/10;
        }
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        int i=0, j=l.size()-1,sum=0;
        while(i!=j && i<j) {
        	System.out.println(i+"<<>>"+j);
        	String d = Integer.toString(l.get(i)) + Integer.toString(l.get(j));
        	int x = Integer.parseInt(d);
        	System.out.println(x);
        	sum+=x;
        	i++;
        	j--;
        }
        return sum;
    }
}