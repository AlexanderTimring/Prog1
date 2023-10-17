package Uppgifter;

import java.util.Scanner;

public class Uppg2_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ange den stora bokstaven : ");

		String tecken = input.nextLine();

		char a = tecken.charAt(0);

		int tecknett = a;
		
		int lillatecknett = a + 32;
		
		char litenbokstav = (char)lillatecknett;
		
		System.out.println("Litet " + tecken + " blir " + litenbokstav);
		
	}

}