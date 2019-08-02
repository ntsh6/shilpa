package day2;

import java.util.Scanner;

public class FLOW004 { 
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
	 int n  =	s.nextInt(); 
	 while(n>0) {
		 int a =  s.nextInt(); 
		  System.out.println(sum(a)); 
		  n--;
	 }
		
	}

	private static int sum(int a) {  
	int last = a % 10;
	int temp = a;
	int count = 0;
	while (temp != 0) {
		count++;
		temp = temp / 10;
		}
	int power = (int) Math.pow(10, count - 1);
	int first = a / power;
	return first + last;  
		
		
	}
		
		 
	}
	 
		
			 
		


