class Solution {
    public int passThePillow(int n, int time) {
        boolean forw = true;
        int ans=1;
        for(int i=0;i<time;i++){
            if(forw)
                ans++;
            else
                ans--;
            if(ans==n)
                forw=false;
            if(ans==1)
                forw=true;
        }
        return ans;
    }
}