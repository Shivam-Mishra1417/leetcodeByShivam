class Solution {
    public int countWays(List<Integer> nums) {

        Collections.sort(nums);
        nums.add(nums.size()+1);
        int ans=0;
        if(nums.get(0)!=0) ans=1;
        
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