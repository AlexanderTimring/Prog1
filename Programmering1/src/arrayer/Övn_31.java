package arrayer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Övn_31 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			int [] i = new int [4];
			
			System.out.println("Ange första värdet");
			i [0] = input.nextInt();
			
			System.out.println("Ange andra värdet");
			i [1] = input.nextInt();
			
			System.out.println("Ange tredje värdet");
			i [2] = input.nextInt();

			System.out.println("Ange fjärde värdet");
			i [3] = input.nextInt();
						
			System.out.println("Array'en innehåller " + Arrays.toString(i));
		
	}

}
