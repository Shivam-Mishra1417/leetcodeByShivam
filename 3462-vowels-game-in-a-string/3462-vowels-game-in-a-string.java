class Solution {
    public boolean doesAliceWin(String s) {
        
        char[] sar = s.toCharArray();
        for(int i=0;i<sar.length;i++){
            if(sar[i]=='a' || sar[i]=='e' || sar[i]=='i' ||sar[i]=='o' ||sar[i]=='u' )
                return true;
        } 
        return false;

    }
}