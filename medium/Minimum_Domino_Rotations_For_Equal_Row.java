package medium;
//https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
public class Minimum_Domino_Rotations_For_Equal_Row {
	class Solution {
	    public int minDominoRotations(int[] tops, int[] bottoms) {
	        int t = tops[0], b=bottoms[0],result=0;;
	        boolean tp=true, bp=true;
	        int ctt=0,ctb=0,cbt=0,cbb=0;
	        for(int i=0;i<tops.length;i++){
	            //count the occurence of first element in tops [t] and bottoms [b]
	            if(tops[i] == t) ctt++;
	            if(tops[i] == b) ctb++;
	            if(bottoms[i] == t) cbt++;
	            if(bottoms[i] == b) cbb++;
	         //checking if each ith position in tops and bottoms has t to make all array as t  
	          if(!(tops[i]==t || bottoms[i]==t)){
	              tp=false;
	          }
	            //checking if each ith position in tops and bottoms has b to make all array as b
	           if(!(tops[i]==b || bottoms[i]==b)){
	              bp=false;
	        }
	        }
	        //if both are false then not possible to make whole array same
	        if(!(tp || bp))
	            return -1;
	        else{
	            // if possible then best answer would be the one with highest occurence
	            int l = Math.max(Math.max(ctt,ctb),Math.max(cbt,cbb));
	            System.out.println("t tops" +ctt+"  b tops"+ctb);
	             System.out.println("t bottoms" +cbt+"  b botoms"+cbb);
	            result = tops.length-l;
	        }
	        return result;
	    }
	}
}
