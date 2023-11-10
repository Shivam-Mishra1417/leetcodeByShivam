class Solution {
    public String reverseWords(String s) {
        String ans="";
        s = s.trim();
        //System.out.println(s);
        String[] sp = s.split(" ");
        for(int i =sp.length-1;i>=0;i--){
            
            if(!sp[i].equals(""))
             ans+= sp[i]+" ";
        }
        //System.out.println(ans);
        return ans.substring(0,ans.length()-1);
    }
}