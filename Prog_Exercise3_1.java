/**Program:Prog_Exercise3_1
 * File:Prog_Exercise3_1.java
 * Summary:Generates a random # between 1 & 10000, asks the users to guess a value and informs them if that value is to high or low.  After words 
 * 		shrinks the number range to make it easier to guess the value and repeats until correct.
 * Author:Lorenzo Quintana
 * Date:Dec 3, 2017
 */
import java.util.Scanner;

public class Prog_Exercise3_1 {
	public static void main (String[]args){
		int randomNumber;
		randomNumber = (int) (Math.random() * 9999 + 1);
		
		Scanner input = new Scanner(System.in);
		int userGuess;
		int numberOfGuess = 1;
			
		System.out.println("Please guess a # between 1 & 10,000: ");
		
		do {
		userGuess = input.nextInt();
		
		if (userGuess == randomNumber)
			System.out.println("Your guess is correct. It took you " + numberOfGuess + " tries.");
		
		else if (userGuess < randomNumber)
			System.out.println("Too Low," + " Please enter a number between " + userGuess + " and " + (userGuess + 2000));
			
		else if (userGuess > randomNumber)
			System.out.println("Too High," + " Please enter a number between 1 " + "and " + userGuess + ": ");
		numberOfGuess++;
		
		} while (userGuess != randomNumber);	
	}
}