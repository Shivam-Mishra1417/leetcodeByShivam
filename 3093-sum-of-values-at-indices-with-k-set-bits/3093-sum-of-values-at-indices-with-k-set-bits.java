class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       // boolean [] bo = new boolean[nums.size()];
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s = Integer.toBinaryString(i);
            int x = s.replace("0","").length();
            if(x==k) sum+=nums.get(i);
            //bo[i] = true;
        }

        

        return sum;
    }
}