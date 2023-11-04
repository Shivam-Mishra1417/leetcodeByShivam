class Solution {
    public int thirdMax(int[] nums) {

       Set<Integer> st = new TreeSet<Integer>();

       for(int i=0;i<nums.length;i++)
        st.add(nums[i]); 

        Iterator<Integer> it = st.iterator();
        int count=0, ans=0, t= st.size()-3;
        while(it.hasNext()){
           
            ans = it.next();
            if(count==t){
                break;
            }
             count++;
        }
       // System.out.println(st);

        return ans;
    }
}