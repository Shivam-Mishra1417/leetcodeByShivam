class Solution {
    public int reverse(int x) {
        long res=0;
        boolean neg = false;
        if(x<0){ neg = true;
        x *=-1;}
       
        while(x>0){
            int t = x%10;
            res = res*10 + t;
            x = x/10;
            //System.out.println(res);
        }
        
        if(res>Integer.MAX_VALUE)
        { res=0;}
        if(neg) res*=-1;
    return (int)res;
    }
}