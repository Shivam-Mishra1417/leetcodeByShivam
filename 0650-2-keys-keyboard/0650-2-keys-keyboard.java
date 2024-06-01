class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;
        int sum=0;
        int ct=2;
        while(n>ct){
            if(n%ct==0){
                n = n/ct;
                sum+=ct;
            }
            else{
                ct++;
            }
        }
        return sum+ct;
    }
}