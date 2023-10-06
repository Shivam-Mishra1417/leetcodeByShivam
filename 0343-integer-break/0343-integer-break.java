class Solution {
    public int integerBreak(int n) {
        // List<Integer> list = new ArrayList<Integer>();
        // list.add(0);
        // list.add(0);
        // list.add(1);
        // list.add(2);
        // list.add(4);
        // list.add(6);
        // list.add(9);
        // if(n<7) return list.get(n);
        // return Math.max(2*integerBreak(n-2), 3*integerBreak(n-3));

            if(n==2) return 1;
            if(n==3) return 2;
       
            if(n%3==0)
            return (int)Math.pow(3,n/3); 
            else if(n%3==1)
            return (int)(Math.pow(3,Math.floor(n/3)-1)*4);
            else return(int)(Math.pow(3,Math.floor(n/3) )*2);
       

    }
}