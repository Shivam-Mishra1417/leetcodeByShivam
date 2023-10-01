// class Solution {
//     public String maximumOddBinaryNumber(String s) {
//         String res="";
//         for(int i=0;i<s.length();i++){
//           if(s.charAt(i)=='0'){
//               res = res+ "0";
//           }
//           else{
//               res = "1"+ res;
//           }
//         }
       
//         return res.substring(1)+"1";
//     }
// }

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0, zeroes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else zeroes++;
        }
        return "1".repeat(ones - 1) + "0".repeat(zeroes) + (ones > 0 ? "1" : "");
    }
}