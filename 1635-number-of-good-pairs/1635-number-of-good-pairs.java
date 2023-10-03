class Solution {
    public int numIdenticalPairs(int[] nums) {
       int[] freq = new int[101];

        int res=0;
        for(int x:nums){
            res+= freq[x];  
            freq[x]++;
             
        }
        return res;
    }
}