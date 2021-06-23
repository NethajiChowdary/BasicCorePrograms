package basicprograms;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter the value of a and b");
	     a=s.nextInt();
	     b=s.nextInt();
	     c=a;
	     a=b;
	     b=c;
	     System.out.println("After swapping: " +a+" "+b);
	}

}
