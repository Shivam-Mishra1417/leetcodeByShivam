class Solution {
   public static String convert(String s, int numRows) {
       if(numRows==1) return s;
         int index=0, l = s.length();
         String[] res = new String[numRows];
         for(int i=0;i<res.length;i++)
        	 res[i]="";
         boolean dir=false;
         for(int i=0;i<s.length();i++) {
        	 if(!dir) {
        		//System.out.println(index+"  "+Arrays.toString(res));
        	 
        	 res[index++]+=s.charAt(i);
        	 if(index==numRows) {dir= true; index--; }
        	 //System.out.println(index+" >> "+Arrays.toString(res));
        	 }
        	 else {
        		// System.out.println(index+"  "+Arrays.toString(res));
    
        		 res[--index]+=s.charAt(i); 
        		 if(index == 0) {dir = false; index++;}
        		// System.out.println(index+" >> "+Arrays.toString(res));
        		 
        	 }
         }
         String ans="";
         for(int i=0;i<res.length;i++)
        	 ans+=res[i];
         
         return ans;
	    }
}