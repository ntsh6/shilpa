package day2;

import java.util.Scanner;

public class TLG { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int numberofrounds =0;
	 int player1_initaialscore =0;
	 int player2_initialscore =0;
	 int Max_difference =0;
	 int who_won =0;  
	  int Scoredtobedone1 =0; 
	  int Scoredtobedone2 =0;  
	  numberofrounds= sc.nextInt();
	  
	 while(numberofrounds-- > 0) {
		  Scoredtobedone1 = sc.nextInt();
		  Scoredtobedone2 = sc.nextInt(); 
		  player1_initaialscore += Scoredtobedone1;
		  player2_initialscore += Scoredtobedone2;  
		   if((player1_initaialscore-player2_initialscore) > Max_difference) {
			    Max_difference = player1_initaialscore-player2_initialscore;
			     who_won =1;
		   } 
		   if((player2_initialscore-player1_initaialscore) > Max_difference) {
			    Max_difference = player2_initialscore-player1_initaialscore;
			     who_won =2;
		   }
		    
		
		  
	 } 
	
	 
	
	   System.out.println(" the won is "+ who_won + " "+ Max_difference);   	
	 
 	}

}
