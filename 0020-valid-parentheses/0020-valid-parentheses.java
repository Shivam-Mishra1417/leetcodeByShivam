class Solution {
    public boolean isValid(String s) {
        char c = s.charAt(0);
        if(c==')' || c=='}' || c==']') return false;
       
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char x = s.charAt(i);
            if(x==')' || x=='}' || x==']'){
            if(st.size()==0) return false;    
            if( x == '}' && st.peek() == '{')
            st.pop();

           else if( x == ')' && st.peek() == '(')
            st.pop();

           else if( x == ']' && st.peek() == '[')
            st.pop();

           else return false; 

             }
             else{
                 st.push(x);
             }
        }

        if(st.size()>0) return false;
        else return true;

    }
}