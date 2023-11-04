class Solution {
    public int countSegments(String s) {
        int ct=0;
        boolean flag=false;
        s = " "+s;
        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i) ==' ' && s.charAt(i+1)!=' '){
            ct++;    
            flag = true;
           }
        }
        return ct;
    }
}