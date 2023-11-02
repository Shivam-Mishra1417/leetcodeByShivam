class Solution {
    public int countWays(List<Integer> nums) {

        Collections.sort(nums);
        nums.add(nums.size()+1);// to check if all students can be selected
        int ans=0;
        if(nums.get(0)!=0) ans=1; // If 0 is not in the list then we can have a case where we do not select any student beacuse of condition 2.
        
        // for each inex we check if we select students till that index, is condition 2 being met because all other nums[i] should be less than selected students ie. i. and also length should be more for each nums[i].
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i+1)> i+1 && nums.get(i)<i+1)
                ans++;
        }
        return ans;
       /* HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
        boolean zero=false;
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i),0)+1);
            if(nums.get(i)==0) zero=true;
        }
        int sum=0,ans=0;
        for(int i=0;i<nums.size();i++){
            if(map.containsKey(i))
            {
                sum+=map.get(i);
                if(sum>i)
                ans++;
            }
        }
        return (zero)?ans:ans+1;*/
    }
}