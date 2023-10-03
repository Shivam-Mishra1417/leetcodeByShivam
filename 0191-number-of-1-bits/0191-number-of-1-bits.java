public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       // String s = ""+n;
      //  System.out.println(s+"    --> "+s.replace("0",""));
        return Integer.bitCount(n);
    }
}