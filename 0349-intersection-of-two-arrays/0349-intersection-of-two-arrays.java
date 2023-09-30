class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           ArrayList<Integer> list = new ArrayList<>();
	       HashMap<Integer,Boolean> map = new HashMap<>();
	       
	       for(int i=0;i<nums1.length;i++) {
              // if(!map.getOrDefault(nums1[i],false))
	    	   map.put(nums1[i], true);
	       }
	       
	       for(int i=0;i<nums2.length;i++) {
	    	   if(map.containsKey(nums2[i]) && map.getOrDefault(nums2[i], false)) {
	    		   list.add(nums2[i]);
	    		   map.put(nums2[i], false);
	    	   }
	       }
	        

	        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
	    }
}