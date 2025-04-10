package day6;

import java.util.Scanner;

public class TableValues {
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		int A = val.nextInt();
		System.out.println("ENTER THE VALUE TO PRINT");
		
		for(int i=1 ; i<=A ; i++) {
			if(A%4==0) {
				System.out.println("SRINI");
			}
			else {
				System.out.println(A);
			}
			val.close();
		}
	}
}
