package Uppgifter;

import java.util.Scanner;

public class Upp2_5sid35 {

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Skriv ditt namn : "); // Skriver ut ange namn
		
		String namn = input.nextLine(); // Läser in text
				
		char a = namn.charAt(0);
		
		char b = namn.charAt(10);
		
		int c = namn.indexOf(' ');
		
		System.out.println();

		System.out.println("Dina initialer är : " + a + " " + c);

	}

}
