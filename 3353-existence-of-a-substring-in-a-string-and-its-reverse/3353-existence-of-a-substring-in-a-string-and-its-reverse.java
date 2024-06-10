class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder x = new StringBuilder();  
        x.append(s);
        x.reverse();

        HashSet<String> st = new HashSet<>();
        for(int i=1;i<x.length();i++){
            st.add(new String(new char[]{x.charAt(i-1), x.charAt(i)}));
        }

        for(int i=0;i<s.length()-1;i++){
            String w = s.substring(i,i+2); 
            if(st.contains(w))
                return true;
        }
        return false; 

    }
}