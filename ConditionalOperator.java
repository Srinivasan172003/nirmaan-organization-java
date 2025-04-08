package day4;

import java.util.Scanner;

public class ConditionalOperator {
   public static void main(String[] args) {
	Scanner num_1 = new Scanner(System.in);
	
	
	int A = num_1.nextInt();
	
	System.out.println("YOUR MARK IS :" + A);
	
	if( A >=50 && A<=100) {
		if(A>=95 ) {
			System.out.println("YOU HAVE GOT 'A ++' GRADE");
		}
		else if (A>=90 ){
			System.out.println("YOU HAVE GOT 'A' GRADE");
		}
		else if(A >=85 ) {
			System.out.println("YOU HAVE GOT 'B +' GRADE");
		}
		else if (A >=80) {
			System.out.println("YOU HAVE GOT 'B' GRADE");
		}
		else if (A>=70) {
			System.out.println("YOU HAVE GOT 'C' GRADE");
		}
		else {
			System.out.println("YOU HAVE GOT 'D' GRADE");
		}
	}
	else if(A<35 && A>=0) {
		System.out.println("YOU HAVE SCORED LESS MARK & FAILED IN THIS EXAM ");
	}
	else {
		System.out.println("MARK YOU ENTERD INVALID, KINDLY UPLOAD A MARK AGAIN");
		
	}
	num_1.close();
}
}
