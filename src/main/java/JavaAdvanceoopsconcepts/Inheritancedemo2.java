package JavaAdvanceoopsconcepts;

public class Inheritancedemo2 extends Inheritancedemo1 {
	
	public void testdemo2() {
		System.out.println("Value is from demo2 ");
	}
	
	public void test1() {
		
		System.out.println("The result is coming from inher demo2");
	}
	
	

	public static void main(String[] args) {
		Inheritancedemo2 demo2 = new Inheritancedemo2();
		demo2.test1();
		demo2.test3();
		demo2.testdemo2();
		
}

}
