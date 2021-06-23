package basicprograms;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is the largest number");
		else if(b>a&&b>c)
			System.out.println(b+" is the largest number");
		else
			System.out.println(c+" is the largest number");
	}

}
