package day3;

import java.util.Arrays;

public class MERGE2SORTED { 
	public static void main(String[] args) {
		int arr1 [] = { 1,5,3,7,9};
		int arr2[]= { 2,4,6,8,10,11,12,13};
		 
		Arrays.sort(arr1);
		Arrays.sort(arr2); 
		
		 int n1 =arr1.length;
		 int n2= arr2.length;
		  
		 int res [] = new int[n1+n2]; 
		   int i=0; 
		   int j =0;
		   int k =0;
		   while(i<n1 && j<n2) { 
			   
			    if(arr1[i]<arr2[j]) {
			    	res[k]=arr1[i];
			    	i++;
			    	k++;
			   } 
			    else { 
			    	res[k]= arr2[j]; 
			    	j++;
			    	k++;
			    } 
			   
		   }   
		   while(i<n1) {
		    	 res[k++] = arr1[i++];
		    } 
		    while(j<n2) {
		    	 res[k++] = arr2[j++];
		    } 
		    for (int k11 : res) { 
		    	System.out.print(k11);
				
			}
		
		 
	}

}
