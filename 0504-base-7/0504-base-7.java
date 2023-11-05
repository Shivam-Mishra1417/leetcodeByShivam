class Solution {
    public String convertToBase7(int num) {
        String ans="";
        if(num==0) return num+"";
        boolean neg=false;
        if(num <0){
            neg = true;
            num = num*(-1);
        }
        
        while(num!=0){
            ans = num%7+""+ans;
            num = num/7;
        }
        return (neg)? "-"+ans:ans;
    }
}