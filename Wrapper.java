package day22;

public class Wrapper {
	/*A wrapper in Java is a class that encapsulates a primitive data type 
	or another object to provide additional functionality or abstraction*/
	public static void main(String[] args) {
		//PRIMITIVE DATA TYPE
		String name = "vijay";
		System.out.println(name.toUpperCase());
		//but we cannot perform a these operations in non-primitive data types so we use wrapper
		
		
		//WRAPPING IS OF TWO TYPES -- ( BOXING , UNBOXING )
		//AUTOBOXING
		int num = 30;
		Integer num1 = num;
	    System.out.println(num1.compareTo(num));//shows zero when equal
	    System.out.println(num1.reverse(56));
		
	    Float flo = 56.6f;
	    System.out.println(flo.intValue());
	    
	    Double dou = 5628.242d;
	    System.out.println(dou.longValue());
	    
	    Boolean bool = true;
	    System.out.println(bool.compare(true, false));
	    
	    Character cha = 'A';
	    System.out.println(cha.hashCode());
	    
	    Byte byt = 'A';
	    System.out.println(byt.byteValue());
	    
	    //UNBOXING
	    int num2 = num1;
	    float flo2 = flo;
	    double dou2 = dou;
	    boolean bool2 = bool;
	    char cha2 = cha;
	    byte byt2 = byt;
	    
	    
	  
	    
}
}
