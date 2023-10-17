package Uppgifter;

import java.util.Scanner;

public class Skunnertest {

	public static void main(String[] args) {
		
		/*
		  
		 Hallå :) 
		 
		 */
		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Ange Namn : "); // Skriver ut ange namn
		
		String namn = input.nextLine(); // Läser in text
		
		System.out.println("Ditt namn är " + namn); // Skriver ut det du skrev in
		
		System.out.println("Hur gammal är du? "); // Skriver ut Hur gammal är du

		int ålder = input.nextInt(); // läser in ett heltalsnummer 
		
		System.out.println("Hej " + namn +  " jag ser att du är " + ålder + " år gammal");
		
		
		
		

	}

}
