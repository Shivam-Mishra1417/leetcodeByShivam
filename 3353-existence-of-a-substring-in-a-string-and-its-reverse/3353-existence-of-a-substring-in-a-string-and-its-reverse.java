class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder x = new StringBuilder();  
        x.append(s);
        x.reverse();

        HashSet<String> st = new HashSet<>();
        for(int i=0;i<x.length()-1;i++){
            st.add(x.substring(i,i+2));
        }

        for(int i=0;i<s.length()-1;i++){
            String w = s.substring(i,i+2); 
            if(st.contains(w))
                return true;
        }
        return false; 

    }
}