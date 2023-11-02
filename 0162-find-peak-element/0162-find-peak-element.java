class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        return bs(nums, 0, nums.length-1);
    }

    public int bs(int[] num, int l, int r){

        int m = l+(r-l)/2;
        if(m==0)
            {
                if(num[m+1]<num[m])
                    return m;
                else 
                return bs(num, m+1,r );
            }
        else if(m==num.length-1){
            if(num[m-1]<num[m])
            return m;
        }
        else if(num[m-1]<num[m] && num[m+1]<num[m])
        return m;
        else if(num[m-1]>num[m])
        return bs(num, l,m-1);
        else 
        return bs(num, m+1,r );

        return 0;
    }
}