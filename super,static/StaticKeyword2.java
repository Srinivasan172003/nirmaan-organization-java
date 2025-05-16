package day18;


	
	class  multiple {
		static String name = "name to change ";
	}
	class multiple2 {
		static String name2 = "name 2";
	}
	
	public class StaticKeyword2 {
	
	public static void main(String[] args) {
		
		multiple.name = " NAME CHANGED ";
		System.out.println(multiple.name);
	}

}
