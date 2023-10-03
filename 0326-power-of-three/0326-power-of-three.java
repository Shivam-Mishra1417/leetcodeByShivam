class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n<3) return false;

        int l = n%10;
        if(!(l==1 || l==3 || l==7 || l==9))
            return false;
        else{

            while(n>3){
                if(n%3!=0) return false;
                n=n/3;
            }
        }
        return true;
    }
}