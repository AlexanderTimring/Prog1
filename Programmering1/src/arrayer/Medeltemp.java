package arrayer;

import java.util.Scanner;

public class Medeltemp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] i = new int [5];
		
		System.out.println("Ange Temp");
		i [0] = input.nextInt();
		
		System.out.println("Ange Temp");
		i [1] = input.nextInt();
		
		System.out.println("Ange Temp");
		i [2] = input.nextInt();
		
		double medel = (i[0] + i[1] + i[2])/3.0;
		
		System.out.println("Medel temperaturen är " + medel);
		
	}

}
