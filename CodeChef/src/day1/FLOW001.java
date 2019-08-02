package day1;

import java.util.Scanner;

public class FLOW001 { 
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
	 int T = 	s.nextInt(); 
	  while((T>0)&&(T<3)) {
		 int a =  s.nextInt(); 
		 int b =  s.nextInt(); 
		  
		if ((a>0 && a <=5)&& (b>0 && b<=2)) { 
			int c =a+b ; 
			System.out.println(c);
		} 
		T--;
	  }
		
	}

}
