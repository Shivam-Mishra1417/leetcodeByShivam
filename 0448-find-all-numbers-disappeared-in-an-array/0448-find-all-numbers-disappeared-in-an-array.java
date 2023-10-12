class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        int index=0;
        while(index < nums.length){
            
            if(index == nums[index]-1 || nums[index] == nums[nums[index]-1]) index++;
            else{
                int tmp = nums[index];
                nums[index] = nums[nums[index]-1];
                nums[tmp-1] = tmp;
            }
       // System.out.println("Array = "+Arrays.toString(nums));
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1)
            list.add(i+1);
        }
        return list;
    }
}