package day1;

import java.util.Scanner;

public class ATM { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);  
		int n = s.nextInt(); 
		while(n>0) {
		
		System.out.println(" enter the amount to with draw");
		
		
		
	 int x = 	s.nextInt(); 
	 
	 double y = s.nextDouble(); 
	 if((x>0&& x<2000) && (y>0 && y<20000) &&(x+0.50<y)&& (x%5==0)) {
		 y= (y-x)-0.50;  
		 System.out.println("The remaining balance in account is "+y);
		 
	 } 
	 
	 else {
		  System.out.println("Enter the correct value of ammount multiples");
	 }
	
	 n--;
		}
}

}
