class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String> st = new HashSet<String>();
        Set<String> lt = new HashSet<String>();

        for(int i=0;i<=s.length()-10;i++){
            String tmp  = s.substring(i,i+10);
            System.out.println(tmp+"  "+tmp.length());
            if(st.contains(tmp))
            lt.add(tmp);

            st.add(tmp);
        }
        return new ArrayList<String>(lt);
    }
}