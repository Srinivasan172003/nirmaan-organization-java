package day4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
    	Scanner val = new Scanner(System.in);
    	
    	System.out.println("Arithematic Operations");
    	
    	System.out.println("Enter the first number : ");
    	int A = val.nextInt();
    	System.out.println("Enter the second number: ");
    	int B = val.nextInt();
    	//SELF DECLARED VARIABLES
    	int C = 25;
    	int D = 50;
    	int E = 5;
    	int F = 100;
        int G = 10;
        int H = 12;
    	
    	System.out.println("Arithematic opearations");
    	System.out.println("Addition : "+(A + B));
    	System.out.println("Subraction :" +(A - B));
    	System.out.println("multiplication :"+ (A * B));
    	System.out.println("Division :"+(A / B));
    	System.out.println("Modulus: "+ (A % B));
    	
    	
    	System.out.println("Relational Operation : ");
    	System.out.println( A+" > " +B+ ": "+  (A > B));
    	System.out.println( A+" < " +B+ ": "+  (A < B));
    	System.out.println( A+" >= " +B+ ": "+  (A >= B));
    	System.out.println( A+" <= " +B+ ": "+  (A <= B));
    	System.out.println( A+" == " +B+ ": "+  (A == B));
    	System.out.println( A+" != " +B+ ": "+  (A != B));
    	
    	System.out.println("Logical operations : ");
    	System.out.println("(12 > 10 AND 20 < 50) :" + ((A>G) && (C<D)));
    	System.out.println("(12 < 5 OR 25 > 100) :" + ((A<E) || (C>F)));
    	
    	System.out.println("Assaignment Operation :");
    	System.out.println("Initial vallue : " + G);
    	System.out.println("After + = "+  (G +=12));
    	System.out.println("After - = "+  (G -=12));
    	System.out.println("After * = "+  (G *=12));
    	System.out.println("After / = "+  (G /=12));
    	System.out.println("After % = "+  (G %=10));
    	
    	
    	System.out.println("Unary Operation: " );
    	System.out.println("Initial value :" +(H));
    	System.out.println("After increment : "+ (++H));
    	System.out.println(("After decrement: ")+ (--H));

        System.out.println("Conditional Operation: ");
    	System.out.println("12 is "+ ((H % 2 == 0)?"EVEN":"ODD"));
}
}
