package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
	
	//exception in java An exception in Java is an unexpected event that disrupts the normal flow of a program
	
	public static void main(String[] args) {
		
		System.out.println("EXCEPTION IN JAVA ");
	
		Scanner A = new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER ");
		String word = A.nextLine();
		try {
			System.out.println(word);
		}
		catch (Exception inp){
			System.out.println("MISMATCH NUMBER");
		}
		int[] num1 = null;
		try {
			System.out.println(num1[0]);
		}
		catch(NullPointerException nul) {
			System.out.println("Null pointer exception ");
		}
		System.out.println("ENTER SECOND VALUE TO CHECK EXCEPTION");
		int val = A.nextInt();
		try {
			System.out.println(10 / val);
			System.out.println("NO EXCEPTION ARRAISED");
		}
		catch(ArithmeticException Ar) {
			System.out.println("ARITHEMATIC EXCEPTION");
		}	
		catch(NullPointerException Nu) {
			System.out.println("NULL POINTER EXCEPTION");
		}
		catch (Exception E){
			System.out.println(E);
		}
		
		
	}

}
