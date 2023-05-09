package easy;
//https://leetcode.com/problems/sorting-the-sentence/
public class Sorting_the_Sentence {
	
	
	public static void main(String[] args) {
		String s1 = "is2 sentence4 This1 a3";
		
		class Solution {
		    public String sortSentence(String s) {
		        String res ="";
		        
		        
		        String[] sentence_split = s.split(" ");
		        String[] words = new String[sentence_split.length];
		        for(int i=0;i<sentence_split.length;i++) {
		        	String word = sentence_split[i].substring(0, sentence_split[i].length()-1);
		        	int num = Integer.parseInt(sentence_split[i].substring(sentence_split[i].length()-1));
		        	words[num-1] = word;
		        }
		        
		        for(int i=0;i<words.length-1;i++) {
		        	res+=words[i]+" ";
		        }
		        res+=words[words.length-1];
		        
		        return res;
		    }
		}
		
		//test
		Solution s = new Solution();
		System.out.println(s.sortSentence(s1));
	}
}
