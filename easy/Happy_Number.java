package easy;

import java.util.ArrayList;

//https://leetcode.com/problems/happy-number/
public class Happy_Number {
	class Solution {
	    public boolean isHappy(int n) {
	        
	        if(n==1) return true;
	        String num = n+"";
	        ArrayList<String> formed = new ArrayList<String>();
	        formed.add(num);
	        int no=n;

	        while(true){
	            String tmp = no+"";
	            String[] split = tmp.split("");
	            int nn = 0;
	            for(int i=0;i<split.length;i++){
	                int x = Integer.parseInt(split[i]);
	                    nn+=x*x;
	            }
	            String nns = nn+"";
	            if(formed.contains(nns))
	            break;
	            else
	            formed.add(nns);

	            no=nn;
	        }

	        if(no==1) return true;
	        else return false;
	    }
	}
}
