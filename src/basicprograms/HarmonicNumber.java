package basicprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		double H=0;
		if(n>0)
		{
		for(int i=1;i<=n;i++)
		H=H+(1.0/i);
		System.out.println("Harmonic number is: "+H);
		}
		else
			System.out.println("Enter number greater than 0");
	}

}
