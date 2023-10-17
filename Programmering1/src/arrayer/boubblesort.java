package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class boubblesort {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
		int [] i = new int [3];
		
		System.out.println("Ange första talet");
		i [0] = input.nextInt();
		
		System.out.println("Ange andra talet");
		i [1] = input.nextInt();
		
		System.out.println("Ange tredje talet");
		i [2] = input.nextInt();
		
		
		int temp=0;
		
		for (int skip = 0; skip < i.length - 1; skip++) {
			
			for(int j = 0; skip < i.length - skip - 1; j++) {
				
				if (i[j + 1] > i[j + 1])
					
				 temp = i[j];
				i[j] = i[j + 1];
				i[j + 1] = temp;
			
			}
			
		
			
		}
		}
		
	}