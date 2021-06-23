package basicprograms;

import java.util.Scanner;

public class VowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      char ch = sc.next().charAt(0);
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
	      {
	         System.out.println("Given character is an vowel");
	      }
	      else
	      {
	         System.out.println("Given character is a consonant");
	      }
	}

}
