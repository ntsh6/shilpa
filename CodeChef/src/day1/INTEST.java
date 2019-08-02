package day1;

import java.util.Scanner;

public class INTEST { 
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		int count =0;
	 int n  =	s.nextInt(); 
	 int k =s.nextInt();
	  while(n>0) {
		 int n1 =   s.nextInt();  
		  if(n1 % k ==  0) {
			   count++;
		  } 
		  n--;
		  
		 
		 
	  } 
	  System.out.println(count);
		
		
	}

}
