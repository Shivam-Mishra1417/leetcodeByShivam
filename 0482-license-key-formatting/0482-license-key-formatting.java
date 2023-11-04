class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replaceAll("-","").toUpperCase();
        if(s.equals("")) return "";
        String ans="";
        int x = s.length()%k;
        ans = s.substring(0,x);
       // System.out.println("=> "+ans);
        for(int i=0;i<s.length()/k;i++)
        {
            ans += "-" + s.substring(x+i*k,x+i*k+k);
        }
        return (ans.charAt(0)=='-')?ans.substring(1):ans;
    }
}