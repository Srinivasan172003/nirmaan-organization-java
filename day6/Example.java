package day6;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("ENTER THE TABLE VALUE TO PRINT :");
		int table = val.nextInt();
		System.out.println("ENTER THE NUMBER OF TIMES TABLE NEEDED :");
		int value = val.nextInt();
		
		for(int i=1 ; i<= value; i++) {
			System.out.println(table + "X" + i+ "=" + (table * i)); 
		}
		val.close();
	}
}
