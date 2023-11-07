class FindSumPairs {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    int[] n1,n2 ;

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;

        for(int i=0;i<n2.length;i++)
            map.put(n2[i], map.getOrDefault(n2[i],0)+1);
    }
    
    public void add(int index, int val) {
        
        map.put(n2[index],map.getOrDefault(n2[index],0)-1);
        n2[index]+=val;
        map.put(n2[index],map.getOrDefault(n2[index],0)+1);

    }
    
    public int count(int tot) {
        int ct=0;
        for(int i=0;i<n1.length;i++)
            ct+= map.getOrDefault(tot-n1[i],0);
        return ct;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */