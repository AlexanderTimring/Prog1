package Prov1;

import java.util.Scanner;

public class E_Uppgift_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv meningen : ");
		
		String meningen = input.nextLine();
		
		String första = meningen.substring(0);
		
		int mellanslaget = meningen.indexOf(' ');
		
		int tecken = meningen.length();
		
		System.out.println("Mening : " + meningen + " \nFörsta ordet är : " + första + " \nMeningen består av " + tecken + " tecken");
		
	}

}
