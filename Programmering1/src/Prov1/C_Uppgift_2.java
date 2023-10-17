package Prov1;

import java.util.Scanner;

public class C_Uppgift_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in din mailadress : ");
		
		String adress = input.next();
		
		int vid = adress.indexOf('@');
		
		String förnamn = adress.substring(vid+1);
		
		int domän = adress.indexOf(vid+1);
		
		System.out.println(domän);
		
	}

}
