class Solution {
    HashSet<Integer> prime = new HashSet<>();
    Solution(){
        boolean[] pn = new boolean[101];
        Arrays.fill(pn,true);
        pn[0] = false;
        pn[1] = false;
       // for(int i=2;i<=10;i++){
            for(int j=2;j<=50;j++){
              if(2*j<=100)  pn[2*j]=false;
              if(3*j<=100)  pn[3*j]=false;
              if(5*j<=100)  pn[5*j]=false;
              if(7*j<=100)  pn[7*j]=false;


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