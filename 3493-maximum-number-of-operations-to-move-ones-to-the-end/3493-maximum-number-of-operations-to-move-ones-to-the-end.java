class Solution {
    public int maxOperations(String s) {
        
        char[] sar = s.toCharArray();
        int ans=0,ct=0;
        boolean add = true;
        for(int i=0;i<sar.length;i++){
            if(sar[i]=='1'){
                ct++;
                add = true;
            }
            else if(add){
                ans+=ct;
                add = false;
            }
            //System.out.println(ans+"   "+ct);
        }
        return ans;
    }
}