class Solution {
    public boolean isUgly(int n) {
       
       if(n<1) return false;
       if(n<5) return true;

       while(n>5){
           if(n%2!=0){
               if(n%3!=0){
                   if(n%5!=0){
                       return false;
                   }
                   else{
                       n=n/5;
                   }
               }
               else{
                   n=n/3;
               }
           }
           else{
               n=n/2;
           }
       }
       return true;
    }
}