class Solution {
    public int minOperations(int k) {
        
        if(k==1) return 0;
        int max=Integer.MAX_VALUE,curr=0;
        for(int i= 1;i<=k/2;i++){
            int tmp = (int)Math.ceil((double)(k-i)/i);
            curr = (i-1) + tmp ;
            if(curr<max)
                max = curr;
           // System.out.println(curr+" "+tmp);
        }
        return max;
    }
}