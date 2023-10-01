class Solution {
    public String reverseWords(String s) {
        String res="", tmp=" "; boolean one=true;
        for(int i=0;i<s.length();i++){
            int index = s.length()-1;

            if(!s.substring(index-i,index-i+1).equals(" "))
                tmp +=s.substring(index-i,index-i+1);
            else
             {
                //System.out.println(tmp);
                
                 res = tmp+ res;

                 tmp=" ";

             }
        }
         res = tmp.substring(1)+ res;
        return res;
    }
}