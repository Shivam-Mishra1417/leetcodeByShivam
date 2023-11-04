class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0,si=0,ct=0;

        while(si < s.length && gi < g.length){
            if(s[si]>=g[gi])
            {   ct++;
                si++;
                gi++;
            }
            else {
                si++;
            }
        System.out.println(si+"  "+gi+"  = "+ct);    
        }
        return ct;
    }
}