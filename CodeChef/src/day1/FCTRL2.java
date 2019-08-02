package day1;

import java.util.Scanner;

public class FCTRL2 { 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
	 int n =	s.nextInt(); 
	 while(n>0) {
		 int a =   s.nextInt(); 
		 
		  if(a>=1 && a <=10) {
			 System.out.println(fact(a)) ;
		  } 
		  n--;
	 }
	}

	private static int fact(int a) {
		
		return  ( (a <=1)? a :a*fact(a-1));
	}

}
