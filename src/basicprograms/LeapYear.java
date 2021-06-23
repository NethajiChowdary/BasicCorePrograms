package basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year =s.nextInt();
		s.close();
		if(year<1000)
		{
			System.out.println("Enter a valid Year ");
		}
		
		else if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Entered year is Leap year");
		}
		else
			System.out.println("Entered year is not leap year");
			
	}
}

	