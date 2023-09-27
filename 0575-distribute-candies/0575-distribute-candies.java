class Solution {
    public int distributeCandies(int[] candyType) {
             
		 Set<Integer> st = new HashSet<Integer>();
		 
		 for(int i=0;i<candyType.length;i++)
			 if(!st.contains(candyType[i]))
				 st.add(candyType[i]);
	      return Math.min(st.size(), candyType.length/2);  
	      
	    }
        
    
}