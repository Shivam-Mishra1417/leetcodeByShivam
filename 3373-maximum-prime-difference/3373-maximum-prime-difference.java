class Solution {
    HashSet<Integer> prime = new HashSet<>();
    Solution(){
        boolean[] pn = new boolean[101];
        Arrays.fill(pn,true);
        pn[0] = false;
        pn[1] = false;
        for(int i=2;i<=10;i++){
            for(int j=2;i*j<=100;j++)
                pn[i*j]=false;
        } 
        for(int i=0;i<pn.length;i++)
            if(pn[i])
             prime.add(i);
    }

    public int maximumPrimeDifference(int[] nums) {
        int l=0,r=0;
        for(int i=0;i<nums.length;i++)
            if(prime.contains(nums[i]))
            {
                l=i;
                break;
            }
        
        for(int i=nums.length-1;i>=0;i--)
         if(prime.contains(nums[i]))
            {
                r=i;
                break;
            }
        
        return r-l;
    }
}