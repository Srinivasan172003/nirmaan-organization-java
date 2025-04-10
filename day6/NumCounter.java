package day6;

import java.util.Scanner;

public class NumCounter {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		
		System.out.println("Enter the value of table");
		
		
		int count = 0;
		int A = val.nextInt();
		for (int i=0 ; i<=A; i++) {
			if(A%4==0) {
				System.out.println("SRINI");
				count++;
			}
			else {
				System.out.println(i);
			}
			System.out.println(count);
			val.close();
			
		}
	}

}
