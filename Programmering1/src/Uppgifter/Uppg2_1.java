package Uppgifter;

import java.util.Scanner;

public class Uppg2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ange höjden på triangeln : ");

		int höjden = input.nextInt();
		
		Scanner input1 = new Scanner(System.in);

		System.out.println("Ange basen på triangeln : ");

		int basen = input1.nextInt();
		
		int area = (höjden * basen)/2;
		
		System.out.println("Arean blir " + area);
		
	}

}
