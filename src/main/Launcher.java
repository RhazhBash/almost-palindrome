package main;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Input a message to see if it's 1 character off of being a palindrome");
			String input = scan.nextLine();
		
			if (almostPalindrome(input))
				System.out.println("Change one character and you'll have a palindrome");
			else
				System.out.println("Not an almost-palindrome");
		}
	}
	
	public static boolean almostPalindrome(String input) {
		
		String reversed = "";
		int counter = 0;
		
		for (int i=0; i<input.length(); i++) {
			reversed = reversed + input.charAt(input.length()-i-1);
		}
		
		for (int j=0; j<reversed.length(); j++) {
			if (input.charAt(j)!=reversed.charAt(j))
				counter++;
		}
		
		if (counter==2)
			return true;
		else
			return false;
	}
}
