package Prov1;

import java.util.Scanner;

public class C_Uppgift_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv din täljare : ");
		
		int täljaren = input.nextInt();
		
		System.out.println("Skriv din nämnare : ");
		
		int nämnaren = input.nextInt();
		
		int helaital = täljaren/nämnaren;
		
		int heltalet = (int)helaital;
		
		int resten = täljaren-  helaital * nämnaren;
		
		System.out.println(heltalet + " hela och " + resten + "/" + nämnaren);
		
	}

}
