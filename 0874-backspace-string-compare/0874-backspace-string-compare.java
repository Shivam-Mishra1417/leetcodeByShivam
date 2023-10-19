class Solution {
   public static boolean backspaceCompare(String s, String t) {
	       Stack<Character> st = new Stack<Character>();
	        int index=0;
	       while(index<s.length()){
	           if(s.charAt(index)=='#') {
	        	   if(!st.isEmpty())
	        	   st.pop();
	           }
	           else
	        	   st.push(s.charAt(index));
	           index++;
	       }
	       
	       String ns = new String(st.toString());
	       st.removeAll(st);
	       index=0;
	       while(index<t.length()){
	           if(t.charAt(index)=='#') {
	        	   if(!st.isEmpty())
	        	   st.pop();
	        	   
	           }
	           else
	        	   st.push(t.charAt(index));
	           index++;
	       }
	       String nt = new String(st.toString());
	     //  System.out.println(ns+"   <<>>   "+nt);
	       if(ns.equals(nt)) return true;
	       else return false;
	   }
}