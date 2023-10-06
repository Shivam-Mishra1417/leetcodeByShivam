class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int index=0;
        while(index < strs[0].length()){
        char c=strs[0].charAt(index);
        for(int i=1;i<strs.length;i++){
            if(index>=strs[i].length()){
                return res;
            
            }
            if(strs[i].charAt(index) != c){
            return res;
            }
        }
        res+=c;
        index++;
        }
       return res;
    }
}