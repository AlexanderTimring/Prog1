package Uppgifter;

import java.util.Scanner;

public class Uppg2_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ange ditt tecken : ");

		String tecken = input.nextLine();

		char a = tecken.charAt(0);

		int tecknett = a;

		System.out.println("Tecknet " + tecken + " har teckenkoden " + tecknett);

	}

}
