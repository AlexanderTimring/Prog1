package Uppgifter;

import java.util.Scanner;

public class Upp2_6sid35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
				System.out.println("Ange hela ditt namn, med efternamnet");
				
				String namn = input.nextLine();
				
				int mellanslag = namn.indexOf(' ');
				
				System.out.println(mellanslag);
				
				String förnamnet = namn.substring(0, mellanslag);
				
				String efternamnet = namn.substring(mellanslag + 1);
				
				System.out.println("Ditt förnamn är : " + förnamnet + "\nDitt efternamn är : " + efternamnet);
						
	}

}
