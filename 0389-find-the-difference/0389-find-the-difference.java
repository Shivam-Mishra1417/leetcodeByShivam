/*class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=t1[i])
            return t1[i];
        }

        return t1[t1.length-1];
    }
}*/
class Solution {
    public char findTheDifference(String s, String t) {
        int f[] = new int[26];
        for(char c : s.toCharArray())
            f[c - 'a']--;
        for(char c : t.toCharArray())
            f[c - 'a']++;
        int i = 0;
        for(; i < 26; i++)
            if(f[i] == 1) break;
        return (char)(i + 'a');
    }
}