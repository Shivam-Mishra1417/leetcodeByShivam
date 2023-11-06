class Solution {
    public String intToRoman(int num) {
        
       String s="";

       if(num/1000!=0){
           switch(num/1000){
               case 1: {s+="M"; break;}
               case 2: {s+="MM";break;}
               case 3: {s+="MMM";break;}

           }
           num = num %1000;
       } 

       if(num/100==9){
           s+="CM";
           num = num%100;
       }

       if(num/500!=0){
           s+="D";
           num = num%500;
       }

       if(num/100!=0){
           if(num/100==4)
           s+="CD";
           else{
               switch(num/100){
               case 1: {s+="C";break;}
               case 2: {s+="CC";break;}
               case 3: {s+="CCC";break;}
           }
           }
           num = num%100;
       }

       if(num/10==9){
           s+="XC";
           num = num%10;
       }
       if(num/10==4){
           s+="XL";
           num = num%10;
       }
       if(num/50!=0){
           s+="L";
           num = num %50;
       }

       if(num/10!=0){
           switch(num/10){
               case 1: {s+="X";break;}
               case 2: {s+="XX";break;}
               case 3: {s+="XXX";break;}
           }
           num = num%10;
       }

       if(num==9){
           s+="IX";
           return s;
       }
       if(num==4){
           s+="IV";
           return s;
       }
       if(num/5!=0){
           s+="V";
           num = num%5;
       }

       switch(num){
           case 1: {s+="I";break;}
           case 2: {s+="II";break;}
           case 3: {s+="III";break;}
       }
       return s;        
    }
}