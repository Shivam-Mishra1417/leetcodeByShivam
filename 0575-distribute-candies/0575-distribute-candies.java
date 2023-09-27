class Solution {
    public int distributeCandies(int[] candyType) {
             
		Map<Integer,Integer> st = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<candyType.length;i++)
			 if(!st.containsKey(candyType[i]))
				 st.put(candyType[i], 1);
	      return Math.min(st.keySet().size(), candyType.length/2);  
	      
	    }
        
    
}