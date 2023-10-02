// class Solution {
//     public int longestPalindrome(String s) {
//          int res=0;
//         // HashMap<Character, Integer> map = new HashMap<>();
//         HashSet<Character> set = new HashSet<>();
//          for(int i=0;i<s.length();i++){
//              Character c = s.charAt(i);
//              if(set.contains(c))
//              {
//                  res+=2;
//                  set.remove(c);
//              }
//              else{
//                  set.add(c);
//              }
//              //map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
//          }
//          if(set.size()>0)
//          res++;
//        // System.out.println(map);
//         /*boolean odd=false;
//         for(Character c:map.keySet()){
//             if(map.get(c)%2==0)
//             res+=map.get(c);
//             else{
//                 odd=true;
//                 res+= map.get(c)-1;
//             }
//         }

//         if(odd)
//         return res+1;
//         else return res;*/
//         return res;
//      }
// }

class Solution {
    public int longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int len = str.length,count=0;
        if(len == 1)
        return 1;
        int[] arr = new int[58];
        for(int i = 0;i < len;i++){
            arr[str[i] - 'A']++;
        }
        for(int i = 0;i<58;i++){
            if(arr[i]%2 == 0)
            count += arr[i];
            else if(arr[i]>1)
            count += arr[i]-1;
        }
        if(len == count)
        return count;
        count++;
        return count;
    }
}