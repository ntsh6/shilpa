package day1;

import java.util.Scanner;

public class FLOW002 { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
	 int n = 	s.nextInt();  
	while(n>0) {
		 int a =  s.nextInt();  
		 int b =s.nextInt();
		 int c = a% b ; 
		 System.out.println(c); 
		 n--;
	 }
		
		
		
	}

}
