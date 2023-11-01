class Solution {
    public int kthGrammar(int n, int k) {
        
        if(k==1) return 0;
        if(k==2) return 1;

        int t=1;
        for(int i=2;i<32;i++)
        {
            if(k<Math.pow(2,i)){
                t = i-1;
                break;
            }
            if(k==Math.pow(2,i)){
                    if(i%2==0) return 0;
                else return 1;

            }
        }

        return (kthGrammar(n,(int)(k-Math.pow(2,t)))==0)?1:0;
    }
}





















