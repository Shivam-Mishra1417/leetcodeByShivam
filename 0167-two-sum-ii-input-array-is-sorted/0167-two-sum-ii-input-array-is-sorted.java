class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
       
       int l=0,r=numbers.length-1;

       while(l<r){

           int sum = numbers[l] + numbers[r];

           if(sum==target){
               res[0] = l+1;
               res[1] = r+1;
           }

           if(sum>target) r--;
           else l++; 
       }
       
       /* for(int i=0;i<numbers.length;i++){
            int tmp = bs(numbers, i+1,numbers.length-1,target-numbers[i]);
            if(tmp!=1001){
                res[0] = i+1;
                res[1] = tmp+1;
            } 
        }*/
        return res;
    }

   /* public int bs(int[] nums, int l, int r, int t){

        int m = l+(r-l)/2;
        if(l>r) return 1001;
        if(nums[m]==t) return m;

        if(nums[m]>t)
        return bs(nums, l, m-1,t);
        else
        return bs(nums, m+1,r,t);

    }*/
}