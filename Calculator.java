package day5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
    	
    	
    	System.out.println("NUMBER CALCULATOR");
    	System.out.println("ENTER A VALUE FOR 1ST NUMBER :");
    	int A = val.nextInt();
    	System.out.println("ENTER A VALUE FOR 2ND NUMBER :");
    	int B = val.nextInt();
    	
    	System.out.println("PRESS 1 FOR ADDITION");
    	System.out.println("PRESS 2 FOR SUBRACTION");
    	System.out.println("PRESS 3 FOR MULTIPLICATION");
    	System.out.println("PRESS 4 FOR DIVISION");
    	System.out.println("PRESS 5 FOR MODULUS");
    	
    	int C = val.nextInt();
    	
    switch (C) {
	case 1: {
		System.out.println("ADDITION OF TWO VALUES :" + (A+B));
		break;
	}
	case 2:{
		System.out.println("SUBRACTION OF TWO VALUES :"+ (A-B));
		break;
	}
	case 3:{
		System.out.println("MULTIPLICATION OF TWO NUMBERS : "+ (A*B));
		break;
	}
	case 4 :{
		System.out.println("DIVISION OF TWO NUMBERS : "+ (A/B));
		break;
	}
	case 5:{
		System.out.println("MODULUS OF TWO NUMBERS : "+ (A%B));
		break;
	}
	default:
		System.out.println("ENTER THE CORRECT REQUIRED FORMAT: ");
	}
    val.close();    }
}
