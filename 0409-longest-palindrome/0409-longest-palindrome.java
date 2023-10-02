class Solution {
    public int longestPalindrome(String s) {
         int res=0;
        // HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
         for(int i=0;i<s.length();i++){
             if(set.contains(s.charAt(i)))
             {
                 res+=2;
                 set.remove(s.charAt(i));
             }
             else{
                 set.add(s.charAt(i));
             }
             //map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
         }
         if(set.size()>0)
         res++;
       // System.out.println(map);
        /*boolean odd=false;
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
        else return res;*/
        return res;
     }
}