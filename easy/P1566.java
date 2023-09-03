package sm;

import java.util.Arrays;

public class P1566 {
	public static void main(String[] args) {
		int[] arr = {3,1,2,1,2,1,2,1,4};
		int m = 2;
		int k = 3;
			System.out.println(containsPattern(arr, m, k));
	}
	
	
	public static boolean containsPattern(int[] arr, int m, int k) {
        
		 for(int i=0;i<arr.length-m;i++) {
			 int[] pat = new int[m];
			 for(int h=0;h<m;h++)
				 pat[h] = arr[i+h];
			  
			 System.out.println("Pattern - "+Arrays.toString(pat));
			 int ind = 0;
			 for(int j=i+m;j<(i+m)+(k-1)*m && j<arr.length;j++) {
				 System.out.println("Indexes are : "+j+"  --  "+ind);
				 if(arr[j]==pat[ind%pat.length]) {
					 ind++;
				 }
				 else
					 break;
				if(j==((i+m)+(k-1)*m) -1) 
					return true;
			 }
		 }
		 return false;
	    }
//	 public static boolean containsPattern(int[] arr, int m, int k) {
//		 int res=0;
//		 for(int i=0;i<arr.length-m;i++) {
//			int ct=0;
//			System.out.println("\n\n");
//			System.out.println("Going for = "+arr[i]);
//			 for(int j=i+m;j<(i+m*k) && j<arr.length;j+=m) {
//				 System.out.println(arr[i]+"  --  "+arr[j]);
//				 if(arr[i]!=arr[j]) {
//					 System.out.println("zeroing the res");
//					 res=0;
//					 break;
//				 }
//				 else ct++;
//				 
//				 if(ct == k-1)
//					 res++;
//				 System.out.println("Count = "+ct+ "  & res is  "+res); 
//			 }
//			 System.out.println("Res - "+res);
//			 if(res==m)
//				 return true;
//		 }
//	        
//		 return false;
//	    }
}
