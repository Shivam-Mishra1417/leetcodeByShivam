class Solution {
    public String toGoatLatin(String sentence) {
        String res="";
        String[] sp = sentence.split(" ");
 String suffix = "a";
        for(int i=0;i<sp.length;i++){
           
            char c = sp[i].charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            sp[i] +="ma"+suffix;
            else{
                sp[i]  = sp[i].substring(1)+c+"ma"+suffix;
            }
            suffix+="a";
            res=res+" "+sp[i];
        }

        return res.substring(1);
    }
}