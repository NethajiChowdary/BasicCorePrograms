/**
 * 
 */
package basicprograms;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class FlipCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of times you want to flip a coin : ");
		int numberofFlips=s.nextInt();
		s.close();
		if(numberofFlips<=0)
		{
			System.out.println("Please enter positive integer");	
		}
		else
		{
			int numberofHeads=0;	
			for(int i=0;i<numberofFlips;i++)
			{
				if(Math.random()>0.5)
				{
					numberofHeads++;
					System.out.println(numberofHeads);
				}
			}
			double percentofHeads=(numberofHeads*100)/numberofFlips;
			double percentofTails=100-percentofHeads;
		    System.out.println("Head percentage : "+percentofHeads);
		    System.out.println("Tails percentage :"+percentofTails);
		}

	}

}
