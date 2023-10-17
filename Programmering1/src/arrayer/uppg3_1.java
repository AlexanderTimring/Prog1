package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class uppg3_1 {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
		
		double [] i = new double [3];
		
		System.out.println("Ange första talet");
		i [0] = input.nextDouble();
		
		System.out.println("Ange andra talet");
		i [1] = input.nextDouble();
		
		System.out.println("Ange tredje talet");
		i [2] = input.nextDouble();
		
		double summa = i[0] +  i[1] +  i[2];
		
		double medel = summa / i.length;
		
		System.out.println("Summan är " + summa + "\nMedelvärdet är " + medel);		
	}

}
