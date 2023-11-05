class Solution {
    public String countAndSay(int n) {
        
        if(n==1) return "1";
        String s = "1", res="";
        char ch = s.charAt(0);
        int ct=1;
        for(int j=1;j<n;j++){
            s=(res.equals(""))?s:res;
            res="";
            ct=1;
            System.out.println(j+ " --  "+s);
            ch = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch)
            {ct++;
            
            }
            else{
                res += ct+""+ch;
                ct=1;
                
            }
            ch = s.charAt(i);
        }
        res += ct+""+ch;
        System.out.println(j+ "   "+res);
        }
        
        return res;
    }
}