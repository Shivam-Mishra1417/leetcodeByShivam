package easy;
//https://leetcode.com/problems/nim-game/
public class Nim_Game {
	class Solution {
	    public boolean canWinNim(int n) {
	  
	        if(n%4<=3 && n%4!=0)
	            return true;
	        
	        return false;
	    }
	}
}
