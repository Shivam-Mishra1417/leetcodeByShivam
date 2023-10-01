class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        char prev=s.charAt(0);
        int ct=1;
        s+="1";
        for(int i=1;i<s.length();i++){

            if(s.charAt(i) == prev){
                ct++;
            }
            else{
                if(ct>=3){
                   ArrayList<Integer> lt = new ArrayList<Integer>();
                   lt.add(i-ct);
                   lt.add(i-1);
                   res.add(lt); 
                }
                ct=1;
            }
            prev = s.charAt(i);
            
        }

        System.out.println(res);

        return res;
    }
}