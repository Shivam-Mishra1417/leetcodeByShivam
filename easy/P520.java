package sm;

public class P520 {

	public static void main(String[] args) {
		
		int a = 'a', z = 'z';
		int A = 'A', Z = 'Z';
		//System.out.println(a+"  "+z);
		//System.out.println(A+"  "+Z);
		
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("FlaG"));
		System.out.println(detectCapitalUse("Google"));
	}
	  public static boolean detectCapitalUse(String word) {
		  
		  if(word.length()==1) return true;
	        
		  if(word.charAt(0)>=65 && word.charAt(0)<=90) {
			  if(word.charAt(1)>=65 && word.charAt(1)<=90) {
				  if(range(word.substring(2),65,90)) 
					  return true;
			  }
			  else if(range(word.substring(2),97,122)) 
				  return true;
		  }
		  else {
			  if(range(word.substring(1),97,122)) 
				  return true;
		  }
		  
		  
		  return false;
	    }
	  
	  public static boolean range(String word, int min, int max) {
		  
		  for(int i=0;i<word.length();i++) {
			  if(word.charAt(i)<min || word.charAt(i)>max)
				  return false;
		  }
		  return true;
	  }
}
