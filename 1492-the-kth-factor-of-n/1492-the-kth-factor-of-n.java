class Solution {
    public int kthFactor(int n, int k) {
        int ct=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                ct++;
                if(ct==k)
                    return i;
            }
        }
        if(k==ct+1)
            return n;
        
        return -1;
    }
}