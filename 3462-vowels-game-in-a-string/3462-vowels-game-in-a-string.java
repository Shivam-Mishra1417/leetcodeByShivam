class Solution {
    public boolean doesAliceWin(String s) {
        
        char[] sar = s.toCharArray();
        int ct=0;
        boolean lastcharvowel = false;
        for(int i=0;i<sar.length;i++){
            if(sar[i]=='a' || sar[i]=='e' || sar[i]=='i' ||sar[i]=='o' ||sar[i]=='u' )
                return true;
        } 
        // if(ct>0) return true;
        return false;

    }
}