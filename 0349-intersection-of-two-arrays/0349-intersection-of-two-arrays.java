class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          // ArrayList<Integer> list = new ArrayList<>();
	    //    HashMap<Integer,Boolean> map = new HashMap<>();
	       
	    //    for(int i=0;i<nums1.length;i++) {
        //        if(!map.getOrDefault(nums1[i],false))
	    // 	   map.put(nums1[i], true);
	    //    }
	       
	    //    for(int i=0;i<nums2.length;i++) {
	    // 	   if(map.getOrDefault(nums2[i], false)) {
	    // 		   list.add(nums2[i]);
	    // 		   map.put(nums2[i], false);
	    // 	   }
	    //    }
	        
        //     int [] arr = new int[list.size()];
        //     for(int i=0;i<list.size();i++){
        //         arr[i] = list.get(i);
        //     }
	        
        //     return arr;

         HashSet<Integer> n1= new HashSet<Integer>();
	       HashSet<Integer> n2= new HashSet<Integer>();
	       
	       for(int i=0;i<nums1.length || i<nums2.length;i++) {
	    	   
	    	   if(i<nums1.length) n1.add(nums1[i]);
	    	   if(i<nums2.length) n2.add(nums2[i]);
	    	   
	       }
	       
	       n1.retainAll(n2);
	       return n1.stream()
	    		   .mapToInt(Integer::intValue)
	    		   .toArray();  

	    }
}