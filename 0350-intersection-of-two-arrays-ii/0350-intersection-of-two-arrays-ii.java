class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for(int i=0;i<nums1.length;i++)
        freq[nums1[i]]++;

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(freq[nums2[i]]>0)
            {
                res.add(nums2[i]);
                freq[nums2[i]]--;
            }
        }

        int[] ans = new int[res.size()];
        int j=0;
        for(int x:res)
        ans[j++] =x;

        return ans;
    }
}