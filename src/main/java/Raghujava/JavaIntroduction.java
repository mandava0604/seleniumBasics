package Raghujava;

public class JavaIntroduction {
	
	public void add () 
	{
		int add1 = 20;
		int add2 = 25;
		System.out.println("Addition is : " +(add1+add2));
		
	}
	
	public void add1(int add3, int add4) 
	{
	System.out.println("Addition of : " +(add3+add4));	
	}
	
	public int calculate (int add5, int add6) {
		int sum = add5+add6;
		return sum;
	}
	
	public static void mul(int mul1, int mul2) {
		System.out.println("Multiplication value is :" +(mul1*mul2));
	}

	public static void main(String[] args) 
	{
		JavaIntroduction J1 = new JavaIntroduction();
		J1.add();
		J1.add1(40, 25);
		int result = J1.calculate(123, 143);
		System.out.println("total value is :"+result);
		System.out.println("Hello");
		J1.mul(25,35);
		JavaIntroduction.mul(15, 10);
			

	}

}
