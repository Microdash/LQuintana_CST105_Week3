/**Program:Prog_Exercise4_1
 * File:Prog_Exercise4_1.java
 * Summary:Translates user given words to pig latin equivalent
 * Author:Lorenzo Quintana
 * Date:Dec 26, 2017
 */
import java.util.Scanner;

public class Prog_Exercise4_1 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three words that will be changed to pig latin: ");
		String word1 = input.next(); //I stored each of the user entered words
		String word2 = input.next();
		String word3 = input.next();
		
		int length1 = word1.length(); //The length of each word is stored so the program knows how many spaces to move the moved letters.
		int length2 = word2.length();
		int length3 = word3.length();
		
		String word1L = word1.toLowerCase(); //Each word is made lower case so the program only has to compare to lower case vowels only.
		String word2L = word2.toLowerCase();
		String word3L = word3.toLowerCase();
		
		char a1 = word1L.charAt(0); //Stores the first letter of each word.
		char b1 = word2L.charAt(0);
		char c1 = word3L.charAt(0);
		
		char a2 = word1L.charAt(1); //Stores the second letter of each word.
		char b2 = word2L.charAt(1);
		char c2 = word2L.charAt(1);
		
		String word1U = word1.toUpperCase(); //All words are made upper case again for the output.
		String word2U = word2.toUpperCase();
		String word3U = word3.toUpperCase();

		
		{
		if (a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u') {
			System.out.println("\t " + word1 + "\t \t" + word1U + "WAY");}
		else if (a1 != 'a' && a2 == 'a' || a1 != 'e' && a2 == 'e' || a1 !='i' && a2 == 'i' || a1 != 'o' && a2 == 'o' || a1 != 'u' && a2 == 'u'){
			String word1alt2 = word1U.substring(1, length1) + word1U.charAt(0);
			System.out.println("\t " + word1 + "\t \t" + word1alt2 + "AY");}		
		else if 
				(a1 != 'a' && a2 != 'a' || a1 != 'e' && a2 != 'e' || a1 != 'i' && a2 != 'i' || a1 != 'o' && a2 != 'o' || a1 != 'u' && a2 != 'u') {
				String word1alt = word1U.substring(2, length1) + word1U.charAt(0) + word1U.charAt(1);
				System.out.println("\t " + word1 + "\t \t" + word1alt + "AY");}
		}
		{
			if (b1 == 'a' || b1 == 'e' || b1 == 'i' || b1 == 'o' || b1 == 'u') {
				System.out.println("\t " + word2 + "\t \t" + word2U + "WAY");}
			else if (b1 != 'a' && b2 == 'a' || b1 != 'e' && b2 == 'e' || b1 !='i' && b2 == 'i' || b1 != 'o' && b2 == 'o' || b1 != 'u' && b2 == 'u'){
				String word2alt2 = word2U.substring(1, length2) + word2U.charAt(0);
				System.out.println("\t " + word2 + "\t \t" + word2alt2 + "AY");}	
			else if 
			(b1 != 'a' && b2 != 'a' || b1 != 'e' && b2 != 'e' || b1 != 'i' && b2 != 'i' || b1 != 'o' && b2 != 'o' || b1 != 'u' && b2 != 'u') {
			String word2alt = word2U.substring(2, length2) + word2U.charAt(0) + word2U.charAt(1);
			System.out.println("\t " + word2 + "\t \t" + word2alt + "AY");}
			
		}
		{
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.println("\t " + word3 + "\t \t" + word3U + "WAY");}
			else if (c1 != 'a' && c2 == 'a' || c1 != 'e' && c2 == 'e' || c1 !='i' && c2 == 'i' || c1 != 'o' && c2 == 'o' || c1 != 'u' && c2 == 'u'){
				String word3alt2 = word3U.substring(1, length3) + word3U.charAt(0);
				System.out.println("\t " + word3 + "\t \t" + word3alt2 + "AY");}
			else if 
			(c1 != 'a' && c2 != 'a' || c1 != 'e' && c2 != 'e' || c1 != 'i' && c2 != 'i' || c1 != 'o' && c2 != 'o' || c1 != 'u' && c2 != 'u') {
			String word3alt = word3U.substring(2, length3) + word3U.charAt(0) + word2U.charAt(1);
			System.out.println("\t " + word3 + "\t \t" + word3alt + "AY");}
				
		}
	}
}
