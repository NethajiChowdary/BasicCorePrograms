package basicprograms;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
		    System.out.println("enter the number");
		    int n = s.nextInt();
		    int power =1;
		    if(n>=0 && n<31)
		    {
		     
		      for(int i=1; i<=n; i++)
		      {
		       power =  power * 2  ;
		       System.out.println("powerof a number:" + power );
		      }
		    }
		      else
		      {
		    	  System.out.println("condition is not satisified");
		      }
			}
			
	

	}


