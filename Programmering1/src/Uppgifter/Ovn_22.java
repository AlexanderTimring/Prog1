package Uppgifter;

import java.util.Scanner;

public class Ovn_22 {

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Ange talet som ska kvadreras : "); // Skriver ut ange namn
		
		int tal1 = input.nextInt();
		
		double svar = Math.pow(tal1, 2);
		
		System.out.println("Ditt tal i kvadrat är : " + svar); // Skriver ut det du skrev in
		
	}

}