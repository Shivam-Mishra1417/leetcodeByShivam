class Solution {
    public boolean isPerfectSquare(int num) {

        double noOfDigits_Num = Math.floor( Math.log10(num)+1);
       // System.out.println(num+"  "+noOfDigits_Num);

        double noOfDigits_ans = Math.ceil(noOfDigits_Num/2);
        double l = Math.pow(10,noOfDigits_ans-1);
        double r = Math.pow(10,noOfDigits_ans)-1;
       // System.out.println(l+"  "+r);
        return bs((double)num, l, r);
    }

    public static boolean bs(double num, double l , double r){
      //  System.out.println(l+"  "+r+"   "+num);
        if(l>r) return false;

        double m = Math.ceil(l+(r-l)/2);

        double x = Math.pow(m,2);
       // System.out.println(m+"  "+x+"   "+num);
        if(x==num) return true;
        if(x>num) return bs(num, l, m-1);
        else return bs(num, m+1,r);

    }
}