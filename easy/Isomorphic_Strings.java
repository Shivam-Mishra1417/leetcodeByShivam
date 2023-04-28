package easy;

import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/
public class Isomorphic_Strings {
	static class Solution {
		static int sc=0,tc=0;
		public static void main(String[] args) {
			Solution sol = new Solution();
			sol.isIsomorphic("egg","add");
		}
	    public boolean isIsomorphic(String s, String t) {
	        System.out.println(s.length()+"");
	          String s1="";
	          String t1="";
	          
	          HashMap<String,Integer> maps = new HashMap<String,Integer>();
	          HashMap<String,Integer> mapt = new HashMap<String,Integer>();
	          sc=0;tc=0;
	        for(int i=0;i<s.length();i++){ 
	        	if(maps.containsKey(s.substring(i, i+1))) {
	        		s1+=maps.get(s.substring(i, i+1));
	        	}
	        	else {
	        		sc++;
	        		maps.put(s.substring(i, i+1), sc);
	        		s1+=sc;
	        		
	        	}}
	        	for(int i=0;i<s.length();i++){	
	        	if(mapt.containsKey(t.substring(i, i+1))) {
	        		t1+=mapt.get(t.substring(i, i+1));
	        	}
	        	else {
	        		tc++;
	        		mapt.put(t.substring(i, i+1), tc);
	        		t1+=tc;
	        		
	        	}
	        	
	        }
	        System.out.println(s);
	        System.out.println(t);
	        System.out.println(t1);
	        System.out.println(s1);
	        if(s1.equals(t1)) return true;
	        return false;
	    }
	}
}
