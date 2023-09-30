class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         // ArrayList<Integer> list = new ArrayList<>();
	       HashMap<Integer,Boolean> map = new HashMap<>();
	       HashMap<Integer,Boolean> map1 = new HashMap<>();
	       for(int i=0;i<nums1.length;i++) {
               if(!map.getOrDefault(nums1[i],false))
	    	   map.put(nums1[i], true);
	       }
	       
	       for(int i=0;i<nums2.length;i++) {
	    	   if(map.getOrDefault(nums2[i], false)) {
	    		  
	    		   map1.put(nums2[i], false);
	    	   }
	       }
	        
            int [] arr = new int[map1.keySet().size()];
            int j=0;
             for(int i:map1.keySet()){
                 arr[j++] = i;
             }
	        
            return arr;

        //  HashSet<Integer> n1= new HashSet<Integer>();
	    //    HashSet<Integer> n2= new HashSet<Integer>();
	       
	    //    for(int i=0;i<nums1.length || i<nums2.length;i++) {
	    	   
	    // 	   if(i<nums1.length) n1.add(nums1[i]);
	    // 	   if(i<nums2.length) n2.add(nums2[i]);
	    	   
	    //    }
	       
	    //    n1.retainAll(n2);
	    //    int [] arr = new int[n1.size()];
        //    int j=0;
        //     for(int i:n1){
        //         arr[j++] = i;
        //     }
	        
        //     return arr;  

	    }
}