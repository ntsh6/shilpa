package day3;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] a = {"flower","flow","flight"} ;
	
	for (String string : a) {
		System.out.println(string); 
		
	} 
	 String b =longestPrefix(a); 
	 System.out.println(b);
	
		

	}

	private static String longestPrefix(String[] a) {  
		int size = a.length;
		 if( size ==0 ) {
			  return  " " ; 
			  
		 } 
		 else if(size ==1 ) {
			  return a[0];
		 }
		Arrays.sort(a); 
		 int end = Math.min(a[0].length(), a[size-1].length()); 
		 int i =0;
		 while(i< end && a[0].charAt(i) ==a[size-1].charAt(i)) 
			 i++;
		 String pre = a[0].substring(0, i); 
	        return pre;  
	        
		
		
	}

}
