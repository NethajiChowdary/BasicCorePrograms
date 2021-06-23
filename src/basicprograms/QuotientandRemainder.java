package basicprograms;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter divident: ");
		Scanner s=new Scanner(System.in);
		int divident=s.nextInt();
		System.out.println("Enter divisor: ");
		Scanner s1=new Scanner(System.in);
		int divisor=s1.nextInt();
		int quo=divident/divisor;
		int rem=divident%divisor;
		System.out.println("Quotient= "+quo);
		System.out.println("Remainder= "+rem);
	}

}
