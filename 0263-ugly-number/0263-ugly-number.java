class Solution {
    public boolean isUgly(int n) {
       int x = n;
       if(x<1) return false;
       if(x<5) return true;

       while(x>5){
           if(x%2!=0){
               if(x%3!=0){
                   if(x%5!=0){
                       return false;
                   }
                   else{
                       x=x/5;
                   }
               }
               else{
                   x=x/3;
               }
           }
           else{
               x=x/2;
           }
       }
       return true;
    }
}