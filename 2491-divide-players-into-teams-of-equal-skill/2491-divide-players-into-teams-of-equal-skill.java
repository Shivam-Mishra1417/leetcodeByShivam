class Solution {
     public static long dividePlayers(int[] skill) {
	    	int sum=0;
	    	for(int i=0;i<skill.length;i++) {
	    	sum+=skill[i];   		
	    	}
	    	int target = sum/((skill.length)/2);
	    	System.out.println("The target is "+target);
	    	
	    	for(int i=0;i<skill.length;i++) {
	    		if(skill[i] > target)
	    			return -1;
	    	}
	    	
	    	Arrays.sort(skill);
	    	
	    	int l=0,r=skill.length-1;
	    	long res=0;
	    	
	    	while(l<r) {
	    		if(skill[l]+skill[r]==target) {
	    			res += skill[l]*skill[r];
	    			l++;
	    			r--;
	    		}
	    		else return -1;
	    	}
	    		
	    	
	    	return res;
	    }
	
}