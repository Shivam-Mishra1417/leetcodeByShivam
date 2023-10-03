class Solution {
    public int addDigits(int num) {
       // System.out.println(Math.log10(10));
        
        while(Math.floor(Math.log10(num))+1 > 1){
          num = sum(num);
        //  System.out.println(" num = "+num);
        }

        return num;
    }

    public int sum(int num){
        int s=0;

        while(num>0){
            s+=num%10;
            num=num/10;
        }
        return s;
    }
}