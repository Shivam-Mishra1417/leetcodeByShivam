class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int max=-1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(s.charAt(i))){
                max = (i-map.get(c)-1>max)?i-map.get(c)-1:max;
            }
            else{
                map.put(c,i);
            }
        }
        return max;
    }
}