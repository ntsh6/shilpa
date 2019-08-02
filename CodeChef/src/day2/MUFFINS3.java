package day2;

import java.util.Scanner;

public class MUFFINS3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t>0)
		    {
		      int n=sc.nextInt();
		      int max=-1,rem=1;
		      for(int i=n/2;i<=n;i++)
		      {
		        if(n%i>max)
		        {
		          max=n%i;
		          rem=i;
		        }
		      }
		      System.out.println(rem);
		      t--;
		    }
		
	}

}
