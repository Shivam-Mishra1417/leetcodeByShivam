package sm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P2423 {
	public static void main(String[] args) {
		
		int i='a';
//		System.out.println(equalFrequency("aabb"));//false
//		System.out.println(equalFrequency("aa"));//true
//		System.out.println(equalFrequency("abcc"));//true
//		System.out.println(equalFrequency("abc"));//true

		System.out.println(equalFrequency("ddaccb"));//false
		
		//int[] ar = {1,0,2,0,0,1};
		//System.out.println(allSame(ar));
		
	}
	
	public static boolean equalFrequency(String word) {
		 int [] alp = new int[26];
		
		 for(int i=0;i<alp.length;i++)
			 alp[i]=0;
		 
		 for(int i=0;i<word.length();i++) {
			 char ch = word.charAt(i);
			 alp[ch-97]+=1; 
		 }
		 System.out.println(Arrays.toString(alp));
		 
		 for(int i=0;i<alp.length;i++) {
			 if(alp[i]!=0) {
				 alp[i]--;
				 if(allSame(alp))
					 return true;
				 else
					 alp[i]++;
			 }
		 }
		 
		 return false;
	    }
	public static boolean allSame(int[] arr) {
		int a=0;
		boolean bool=true;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && bool) {
				a = arr[i];
				bool=false;
			}
			else if(arr[i]!=0 && arr[i]!=a)
				return false;
		}
		
		return true;
	}
}
