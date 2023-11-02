class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;

        Set<Integer> st = new TreeSet<>();

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

        int max=0;
        Iterator<Integer> it = st.iterator();
        int last = it.next();
        while(it.hasNext()){
            int curr = it.next();
            int tmp = curr - last;
            last = curr;
            if(tmp>max)
            max = tmp;
        }
        return max;
    }
}