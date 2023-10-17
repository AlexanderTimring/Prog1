package Prov1;

import java.util.Scanner;

public class E_Uppgift_1 {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		System.out.println("Hur stor är första sidan?");
		
		int höjden = input.nextInt();
		
		System.out.println("Hur stor är andra sidan?");
		
		int bredden = input.nextInt();
		
		int area = höjden*bredden;
		
		System.out.println("Sida1 : " + höjden + " \nSida2 : " + bredden + " \nDetta ger arean : " + area);
		
	}

}
