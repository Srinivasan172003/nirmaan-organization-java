package day18;
	class example{
		example(){
			super();
			System.out.println("ugb");
	}
	}
		
	class example2 extends example{
		example2(){
			super(); // it must be initialized first in constructor 
			         // it represents constructor by default
			System.out.println("eufhiewuf");
		}
	}
	
	public class SuperKeyword {
	public static void main(String[] args) {
		
		example2 exp = new example2();
		
	}
		
	}
