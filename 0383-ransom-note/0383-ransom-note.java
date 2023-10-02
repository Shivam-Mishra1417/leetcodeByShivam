class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] mag = new int[26];

        for(int i=0;i<magazine.length();i++){
            mag[magazine.charAt(i) - 'a']++;     
        }

        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(mag[c - 'a']<1)
            return false;
            mag[c - 'a']--;
        }
        return true;
    }
}