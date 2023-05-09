package hard;

import java.util.regex.Pattern;

//https://leetcode.com/problems/valid-number/
public class Valid_Number {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		//true cases
		System.out.println("\t\t TRUE");
		System.out.println(s.isNumber("123"));
		System.out.println(s.isNumber(".1"));
		System.out.println(s.isNumber("1."));
		
		//false cases 
		System.out.println("\t\t FALSE");
		System.out.println(s.isNumber(".1."));
		System.out.println(s.isNumber("6e6.5"));
		System.out.println(s.isNumber("6e65e1"));
		
	}
}

class Solution {
	public boolean isNumber(String s) {
	       String t = s.replaceAll("[^.]", "");
	       String e1 = s.replaceAll("[^e]", "");
	       String e2 = s.replaceAll("[^E]", "");
	       System.out.println(s+"<<>>"+t);
	       if(e1.length()>1 || e2.length()>1 || t.length()>1)
	    	   return false;
	       
	       if(s.contains("e"))
	       if(s.indexOf(".") > s.indexOf("e"))
	    	   return false;
	       if(s.contains("E"))
	           if(s.indexOf(".") > s.indexOf("E"))
	        	   return false;
	        return Pattern.matches("([+-]?[0-9]+((e|E)[+-]?[0-9]+)?[.]?[0-9]*((e|E)[+-]?[0-9]+)?)|([+-]?[.]?[0-9]+((e|E)[+-]?[0-9]+)?[0-9]*((e|E)[+-]?[0-9]+)?)",s);
	    }
}
