class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        if(Integer.bitCount(n)!=1)
        return false;
        return true;
    }
}