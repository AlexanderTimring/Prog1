package operatorer;

import java.util.Scanner;

public class kassa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange varans pris");
		
		int pris = input.nextInt();
		
		System.out.println("Ange belopp som kunden ger");
		
		int belopp = input.nextInt();
		
		int tillbaka = belopp-pris;
		
		int tusen = tillbaka/1000;
		
		int rest = tillbaka%1000;
						
		int femhundra = rest/500;
		
			rest = rest%500;
						
		int tvåhundra = rest/200;
		
		rest = rest%200;
				
		int hundralapp = rest/100;
		
		rest = rest%100;
				
		int femtiolapp = rest/50;
		
		rest = rest%50;
				
		int tjugolapp = rest/20;
		
		rest = rest%20;
				
		int tiomynt = rest/10;
		
		rest = rest%10;
				
		int femkrona = rest/5;
		
		rest = rest%5;
				
		int enkrona = rest/1;
		
		rest = rest%1;
		
		System.out.println(tusen + " st tusenlappar" + "\n"
		+ femhundra + "st femhundralappar" + "\n"
		+ tvåhundra + "st tvåhundralappar" + "\n"
		+ hundralapp + "st hundralappar" + "\n"
		+ femtiolapp + "st femtiolappar" + "\n"
		+ tjugolapp + "st tjugolappar" + "\n" 
		+ tiomynt + "st tiokronor" + "\n"
		+ femkrona + "st femkronor" + "\n"
		+ enkrona + "st enkronor");
		
	}

}