class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();
       if(l1<l2){
           int ct = l2-l1;
           for(int i=0;i<ct;i++)
            num1 = "0"+num1;
       }
       else{
           int ct = l1-l2;
           for(int i=0;i<ct;i++)
            num2 = "0" + num2;
       }
        //System.out.println(num1+"  "+num2); 
        String ans="";
        int index = num1.length()-1;
        int e=0;
        while(index>=0){
            int a = Integer.parseInt(""+num1.charAt(index));
            int b = Integer.parseInt(""+num2.charAt(index));
            int sum = a + b + e;
            if(sum > 9){
                e = 1;
                ans = sum%10 + "" + ans;
            }
            else{
                ans = sum+""+ans;
                e = 0;
            }
            index--;
        }
        if(e!=0)
        ans = "1" + ans;
        return ans;
    }
}