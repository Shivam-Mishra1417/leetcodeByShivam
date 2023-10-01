class Solution {
    public String maximumOddBinaryNumber(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
          if(s.substring(i,i+1).equals("0")){
              res = res+ "0";
          }
          else{
              res = "1"+ res;
          }
        }
       
        return res.substring(1)+"1";
    }
}