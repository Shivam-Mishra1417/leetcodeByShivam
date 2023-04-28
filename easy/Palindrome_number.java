package easy;
//https://leetcode.com/problems/palindrome-number/
public class Palindrome_number {
	class Solution {
	    public boolean isPalindrome(int x) {
	        if(x<0) return false;
	        int n=x;
	        int rev=0;
	        while(n>0){
	           // System.out.println(":"+tmp+"  "+rev+"  "+n);
	            int tmp = n%10;
	            rev = rev*10+tmp;
	            n=n/10;
	            System.out.println(":"+tmp+"  "+rev+"  "+n);
	        }

	        if(rev==x)
	        return true;
	        else
	        return false;

	    }
	}
}
