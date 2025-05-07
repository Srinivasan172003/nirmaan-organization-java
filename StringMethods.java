package day15;

public class StringMethods {

	public static void main(String[] args) {
		//STRING METHODS
		//String methods -------> //	length()
//		charAt(int index)
//		substring(int beginIndex)
//		substring(int beginIndex, int endIndex)
//		toLowerCase()
//		toUpperCase()
//		equals(String anotherString)
//		equalsIgnoreCase(String anotherString)
//		contains(CharSequence sequence)  boolean
//		startsWith(String prefix) boolean
//		endsWith(String suffix)  boolean
//		indexOf(int ch)
//		indexOf(String str)
//		lastIndexOf(String str)
//		replace(char oldChar, char newChar)
//		trim()
//		isEmpty()  boolean
//		split(String regex)
//		concate(String str)
		
		String name ="HARINI PARTHIPAN"  ;
	    int age =  50 ;
        System.out.println("LENGTH VALUE : "+ name.length());
		System.out.println("CHAR AT " + name.charAt(3));
		System.out.println("SUBSTRING " + name.substring(6));
		System.out.println("SUBSTRING INT TO FINAL  :" + name.subSequence(4, 10));
		System.out.println("TOLOWERCASE :" + name.toLowerCase());
		System.out.println("TOUPPERCASE :" + name.toUpperCase());
		System.out.println("EQUALS :" + name.equals("HARI"));
		System.out.println("EQUALS IGNORECASE :" + name.equalsIgnoreCase("harini parthipan"));
		System.out.println("CONTAINS :" + name.contains("HARI"));
		System.out.println("STARTS WITH STARTSWITH : "+name.startsWith("H"));
		System.out.println("ENDS WITH :" + name.endsWith("N"));
		System.out.println("INDEX OF VALUE STRING : " +name.indexOf("N") );
		System.out.println("LATE INDEX OF : " + name.lastIndexOf("N"));
		System.out.println("REPLACE VALUE : "+ name.replace("H" , "R" ));
		System.out.println("TRIM METHODS :" + name.trim());
		System.out.println("is EMPTY VALUE : " + name.isEmpty());
		System.out.println("SPLIT VALUE : " + name.split("PARTHIPAN "));
		System.out.println("CONCATE VALUE :" + name.concat("   BE"));
	}
}
