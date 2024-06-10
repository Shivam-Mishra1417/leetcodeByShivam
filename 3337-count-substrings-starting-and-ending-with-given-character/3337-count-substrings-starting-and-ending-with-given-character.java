class Solution {
    public long countSubstrings(String s, char c) {
        int ct=0;
        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                ct++;
                ans+=ct;
            }
        }
        return ans;
    }
}