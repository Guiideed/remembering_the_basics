package app.exercice1;

import java.util.Scanner;

public class Exercice1 {
		/*learning again after a long break*/
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number ");
		int firstNumber = sc.nextInt();
		System.out.println("enter the second number");
		int secondNumber = sc.nextInt();
		
		if(firstNumber>secondNumber) {
			System.out.println("the first number ("+ firstNumber+") is greater than the second number "+secondNumber+")");
		}else if(firstNumber<secondNumber){
			System.out.println("the second number("+secondNumber+") is greater than the first number "+ firstNumber+")");
		}else {
			
			System.out.println("The numbers are the same, please enter other numbers");
			System.out.println("enter the first number ");
			 firstNumber = sc.nextInt();
			System.out.println("enter the second number");
			 secondNumber = sc.nextInt();
			
			if(firstNumber>secondNumber) {
				System.out.println("the first number ("+ firstNumber+") is greater than the second number ("+secondNumber+")");
			}else if(firstNumber<secondNumber){
				System.out.println("the second number("+secondNumber+") is greater than the first number ("+ firstNumber+")");
		}
		}
		
		
		sc.close();
	}
}
