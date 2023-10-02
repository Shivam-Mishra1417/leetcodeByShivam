class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0;
        String al = "AAA", bo = "BBB";

        for(int i=0;i<colors.length()-2;i++){
            String s = colors.substring(i,i+3);
            if(s.equals(al)) a++;
            if(bo.equals(s)) b++;
            System.out.println(s);
        }
        if(a>b) return true;
        return false;
    }
}