package day12;

public class ConstructorInJava {
	public void add() {
		System.out.println("Empty value");
	}
	public void add(int A , int B) {
		System.out.println("THE ADDITION OF VALUES :  " + (A+B));
	}
	public void add(int A , int B ,int C, int D) {
		System.out.println("THE ADDITON OF GIVEN VALUES ARE : " + (A + B + C + D ) );
	}
	
	ConstructorInJava(){
		
	}
	//empty constructor
	ConstructorInJava(int A , int B){
		System.out.println(A + B);
	}
	//value passed constructor
	
	
	public static void main(String[] args) {
		ConstructorInJava con = new ConstructorInJava();
		
		con.add();
		con.add(20, 10);
		con.add(25, 40, 60, 80);
		
		
	}
}