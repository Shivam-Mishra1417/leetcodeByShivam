class Solution {
    public int hammingDistance(int x, int y) {
        String xx = Integer.toBinaryString(x);
        String yy = Integer.toBinaryString(y);
        int x1=xx.length()-1,y1=yy.length()-1,ct=0;
        while(x1>=0 || y1>=0){
            char a = (x1>=0)?xx.charAt(x1):'0';
            char b = (y1>=0)?yy.charAt(y1):'0';
            x1--;
            y1--;
            if(a!=b) ct++;
        }
        return ct;
    }
}