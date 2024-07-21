class Solution {
    public int minChanges(int n, int k) {
        if(n==k) return 0;
        if(k>n) return -1;
        int ct=0;
        while(n!=0){
            int nb = n%2;
            int kb = k%2;

            if(nb!=kb){
                if(nb==1 && kb==0) ct++;
                else return -1;
            }
            n = n/2;
            k= k/2;
        }
        return ct;
    }
}