class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder x = new StringBuilder();  
        x.append(s);
        x.reverse();

        for(int i=1;i<s.length();i++){
            String w = ""+s.charAt(i-1)+s.charAt(i);
            if(x.indexOf(w)!=-1)
                return true;
        }
        return false; 

    }
}