class Solution {
    public boolean checkStrings(String s1, String s2) {
        
        if(s1.length()!=s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for(int i=0;i<a.length;i++){

            if(a[i] != b[i]){
                boolean m = false;
                for(int j=i+2;j<a.length;j+=2){
                    if(a[j]==b[i]){
                        m=true;
                        char tmp = a[j];
                        a[j] = a[i];
                        a[i] = tmp;
                        break;
                    }
                }
                if(!m) return false;
            }

        }
        return true;
    }
}