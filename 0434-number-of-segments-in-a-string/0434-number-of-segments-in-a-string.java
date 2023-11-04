class Solution {
    public int countSegments(String s) {
        int ct=0;
        s = " "+s; //to handle cases when there is no space at all like "Hello"
        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i) ==' ' && s.charAt(i+1)!=' '){
            ct++;    
           }
        }
        return ct;
    }
}