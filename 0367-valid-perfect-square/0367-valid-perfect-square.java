class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        return bs((double)num, 1, num/2);
    }

    public static boolean bs(double num, int l , int r){
      // System.out.println(l+"  "+r+"   "+num);
        if(l>r) return false;

        int m = (int)Math.ceil(l+(r-l)/2);

         double x = Math.pow(m,2);
       // System.out.println(m+"  "+x+"   "+num);
        if(x==num) return true;
        if(x>num) return bs(num, l, m-1);
        else return bs(num, m+1,r);

    }
}