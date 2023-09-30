class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.size();i++){
            if(nums.get(nums.size()-1-i) <=k)
            set.add((nums.get(nums.size()-1-i)));

            if(set.size()==k)
            return i+1;
        }
        return 0;
    }
}