package day1;

import java.util.Scanner;

public class FLOW006 { 
	 static int sum1(int n)
	 {
	     int sum=0;
	  while(n>0){
	                 int rem=n%10;
	                 sum+=rem;
	                 n/=10;
	             }
	     return sum;
	 }

	 	public static void main (String[] args) throws Exception
	 	{
	 		Scanner sc=new Scanner(System.in);
	 		int tc=sc.nextInt();
	 		int n;
	 		while(tc>0){
	 		   n=sc.nextInt(); 
	 		   System.out.println(sum1(n));
	 		   tc--;
	 		}
	 		}
}
