class Solution {
    public int maximumLengthSubstring(String s) {
        
              int max=0,curr=0;
        for(int i1=s.length();i1>=1;i1--){
            boolean flag = true;
            for(int j=0;j<=s.length()-i1;j++){
                flag = true;
                int[] freq = new int[26];
                for(int i=j;i<j+i1;i++){
                freq[s.charAt(i)-'a']+=1;
                //System.out.println(i1+"  "+j+">>"+Arrays.toString(freq));
                if(freq[s.charAt(i)-'a']==3){
                    flag = false;
                    break;
                }
                }
                if(flag)
                return i1;
            }
            

        }
        return 0;


    }
}