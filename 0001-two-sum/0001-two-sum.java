class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i:nums)
        set.add(i);
        
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            //System.out.println("1st part = "+nums[i]);
            if(set.contains(target-nums[i])){
                //System.out.println("looking for = "+(target - nums[i]));
                for(int j=i+1;j<nums.length;j++){
                   // System.out.println("found = "+i+"  "+j);
                    if(nums[j] == target - nums[i]){
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
        }
        return res;
    }   
}