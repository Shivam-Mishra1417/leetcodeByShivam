class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0,tmp=1;
        char prev = colors.charAt(0);
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==prev){
                tmp++;
                 if(tmp>=3){
                if(prev=='A') a++;
                else b++;
            }
            }
            else
                tmp=1;
            prev = colors.charAt(i);
            // String s = colors.substring(i,i+3);
            // if(s.equals(al)) a++;
            // if(bo.equals(s)) b++;
          //  System.out.println(s);
        }
       // System.out.println(a+"  "+b);
        if(a>b) return true;
        return false; 
    }
}