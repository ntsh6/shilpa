package day1;

import java.util.Scanner;

public class PLAYSTR {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in); 
	 int n = s.nextInt(); 
	  while( n>0) { 
		 int n1  =  s.nextInt();
	 String s1  =s.next(); 
	 String s2= s.next();  
	 int sum1=0;
	 int sum2=0;
	  for(int i=0;i<n;i++){
          if(s1.charAt(i)=='1')
              sum1++;
          if(s2.charAt(i)=='1')
              sum2++;
      }
      if(sum1 == sum2){
          System.out.println("YES");
      }
      else{
          System.out.println("NO");
      }
	} 
	 
	  
	
	
	 n--;
	 
		  
		  
	  }
	 
	}


