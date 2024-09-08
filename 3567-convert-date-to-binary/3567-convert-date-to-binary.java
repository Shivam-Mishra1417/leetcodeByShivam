class Solution {
    public String convertDateToBinary(String date) {
        String[] sp = date.split("-");
        String result="", bin="";
        for(int i=0;i<sp.length;i++){
            int x = Integer.parseInt(sp[i]);
            bin = Integer.toBinaryString(x);
            sp[i] = bin;
            result+=bin+"-";
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}