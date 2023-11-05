class Solution {
    public String[] findWords(String[] words) {
        String r1 = "qwertyuiopQWERTYUIOP",
        r2 = "asdfghjklASDFGHJKL",
        r3 = "zxcvbnmZXCVBNM";
        List<String> res = new ArrayList<String>();
        Boolean flag=true;
        for(int i=0;i<words.length;i++){
            char ch = words[i].charAt(0);
            flag = true;
            String s="";
            if(r1.contains(""+ch))
                s = r1;
            else if(r2.contains(""+ch))
                s = r2;
            else if(r3.contains(""+ch))
                s = r3;    
            for(int j=1;j<words[i].length();j++)
            {
                if(!s.contains(""+words[i].charAt(j))) {  
                flag = false;
                break;
                }
            }
            if(flag)
            res.add(words[i]);
        }
        

        String[] ans = new String[res.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = res.get(i);

        return ans;
    }
}