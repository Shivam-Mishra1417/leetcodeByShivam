class Solution {
    public long minEnd(int n, int x) {
        
       // if(n==1) return (long)x;
        String s = Integer.toBinaryString(n-1);
        String xs = Integer.toBinaryString(x);
       // char[] xc = xs.toCharArray();
        int l   = xs.length()-Integer.bitCount(x);
        int tmp = (s.length() - l);
        if(tmp<0){
            for(int i=0;i<tmp*(-1);i++)
                s = "0"+s;
        }
        tmp = (tmp>0)?tmp:0;
        char[] nxc = new char[xs.length() + tmp];

        for(int i=0;i<nxc.length;i++){
            if(i<tmp)
                nxc[i] = '0';
            else
                nxc[i] = xs.charAt(i-tmp);
        }
         int index=0;
            for(int i=0;i<nxc.length;i++){
                if(nxc[i]=='0'){
                   nxc[i] = s.charAt(index);
                   index++; 
                }
            }
            String nx = new String(nxc);
            long ans = Long.parseLong(nx,2);
            return ans;
    }
}