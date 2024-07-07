class Solution {
    public String getEncryptedString(String s, int k) {
        
        char[] cc = new char[s.length()];
        for(int i=0;i<s.length();i++){
            cc[i] = s.charAt((i+k)%s.length());
        }
        return new String(cc);
    }
}