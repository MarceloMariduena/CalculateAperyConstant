
/* @author: Marcelo Mariduena
 * 
 * Description: write a Java program that prompts the user to enter a positive number n. 
 * The program should then calculate and display the value of the Apery constant given the Apery formula.
 */

import java.util.Scanner;

public class AperyConstantMarceloMariduena {
	public static void main(String[] args) {
		// Variables
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a positive integer: ");
		n = input.nextInt();
		input.close();
		
		System.out.printf("Aprey(%d) = %.20f", n , calcApery(n));
	}
	public static double calcApery(int n) {
		if (n == 1) 
			return 1;
		return (1/ Math.pow(n, 3) + calcApery(n - 1));
	}
}
