package arrayer;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {

		int [] i = new int [4];  // skapar en array 5 st positioner. Skapar ref till denna.
		
		int längd = i.length;   // tar reda på längden på arrayen
		
		// tillderar värde till olika positioner i array
		i [0] = 4;  
		
		i [1] = 7;  
		
		i [2] = 8;  

		i [3] = 1;  

		System.out.println("Array längeden är " + i[0] + " " + i[1] + " " + i[2]); // skriv ut var för sig
		
		System.out.println(Arrays.toString(i));  // skriver ut allt
		
		for (int k = 0; k < 4 ;k = k + 1) {
			
			System.out.println(i [k]);
			
		}
		
	}

}
