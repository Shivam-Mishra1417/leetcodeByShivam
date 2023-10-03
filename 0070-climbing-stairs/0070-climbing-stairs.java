class Solution {
    int[] res = new int[46];
    public int climbStairs(int n) {
        res[1]=1;
        res[2] = 2;
        for(int i=3;i<=n;i++){
            res[i] = res[i-1]+res[i-2];
        }
      return res[n];
    }
}