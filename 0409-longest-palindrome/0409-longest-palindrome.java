class Solution {
    public int longestPalindrome(String s) {
         int res=0;
         HashMap<Character, Integer> map = new HashMap<>();
         for(int i=0;i<s.length();i++){
             map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
         }
       // System.out.println(map);
        boolean odd=false;
        for(Character c:map.keySet()){
            
            if(map.get(c)%2==0)
            res+=map.get(c);
            else{
                odd=true;
                res+= map.get(c)-1;
            }
        }

        if(odd)
        return res+1;
        else return res;
    }
}