class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        for(int i=1;i<n;i++){
            ans+= n/ Math.pow(5,i);
            if(Math.pow(5,i)>n) break;
        }
        return ans;
    }
}