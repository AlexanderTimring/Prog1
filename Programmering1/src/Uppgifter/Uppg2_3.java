package Uppgifter;

import java.util.Scanner;

public class Uppg2_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Substantiv:");
		
		String substantiv = input.nextLine();
	
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Pluralhändelse:");
		
		String plural = input.nextLine();
		
		String samman = substantiv + plural;
		
	System.out.println("En " + substantiv + " flera " + samman);
			
	}

}
