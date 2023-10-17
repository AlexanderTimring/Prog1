package Uppgifter;

import java.util.Scanner;

public class Ovn2_4sid33 {

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Skriv först talet : "); // Skriver ut ange namn
		
		int ett = input.nextInt(); // Läser in text
		
		Scanner  input2 = new Scanner(System.in);
		
		System.out.println("Skriv andra talet : "); // Skriver ut ange namn
		
		int två = input2.nextInt(); // Läser in text
		
		Scanner  input1 = new Scanner(System.in);
		
		System.out.println("Skriv tredje talet : "); // Skriver ut ange namn
		
		int tre = input1.nextInt(); // Läser in text
		
		int summa = ett + två + tre;
		
		double medelvärde = (ett + två + tre)/3.0;
				
		System.out.println("Summan av de tre talen är : " + summa);
		System.out.println("Medel värdet är : " + medelvärde);
		

	}

}
