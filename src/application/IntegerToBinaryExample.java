package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerToBinaryExample {
	public static void main(String []args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			try{
				System.out.println("Type a number to convert to binary: ");
				int integerNumber = sc.nextInt();
				
				String binaryRepresentation = Integer.toBinaryString(integerNumber);
				
				System.out.println("The number " + integerNumber + " converted to binary is: " + binaryRepresentation);
			}catch(InputMismatchException e) {
				System.err.println("Error: Program could not read the integer number!");
			}
		}
		

		
	}

}
