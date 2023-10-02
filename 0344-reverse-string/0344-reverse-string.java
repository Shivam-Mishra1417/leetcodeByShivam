class Solution {
    public void reverseString(char[] s) {
       int l = s.length-1;
        for(int i=0;i<(l+1)/2;i++){
            char tmp = s[i];
            s[i] = s[l-i];
            s[l-i] = tmp;
        }
    }
}