class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        s=s.replaceAll("0","2");
        s=s.replaceAll("1","0");
        s=s.replaceAll("2","1");
        return Integer.parseInt(s,2);
    }
}