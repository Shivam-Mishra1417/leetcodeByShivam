class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       // boolean [] bo = new boolean[nums.size()];
        int sum=0;
        for(int i=0;i<nums.size();i++){
            
            if(Integer.bitCount(i)==k) sum+=nums.get(i);
            //bo[i] = true;
        }

        

        return sum;
    }
}