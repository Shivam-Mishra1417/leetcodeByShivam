class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<4) return false;
        int l = n%10;
        System.out.println(" last digit = "+l);
        if(!(l==4 || l==6)){
        System.out.println("returning false");
        return false;

        }
        else{
            while(n>4){
            System.out.println("returning "+n);
                if(n%4 !=0){
                    return false;}
                 n = n/4;
            }
           

        }
        return true;
    }
}