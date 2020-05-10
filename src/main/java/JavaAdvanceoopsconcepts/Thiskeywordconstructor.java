package JavaAdvanceoopsconcepts;

public class Thiskeywordconstructor {
	
	int empid;
	String name;
	String address;
	String Emailid;
	
	public Thiskeywordconstructor() {
		
		System.out.println("welcome to constructors");
	}
	
	public Thiskeywordconstructor(int empid, String name, String address) {
		this();
		this.empid = empid;
		this.name = name;
		this.address = address;
		
	}
	
	public Thiskeywordconstructor(int empid, String name, String address, String Emailid) {
		//this.empid = empid;
		//this.name = name;
		//this.address = address;
		
		this(empid, name, address);
		this.Emailid = Emailid;
		
	}
	
	public void showdetails() {
		System.out.println("The empid is:" +empid);
		System.out.println("The emp name is: " +name);
		System.out.println("The emp address is: " +address);
		System.out.println("The email id is : " +Emailid);
		
	}
	
	public static void main(String[] args) {
		
		Thiskeywordconstructor tc = new Thiskeywordconstructor(10, "raghu", "jersey city");
		Thiskeywordconstructor tc1 = new Thiskeywordconstructor(20, "Babu", "Jersey City", "rb@gmail");
        tc.showdetails();
        tc1.showdetails();

	}

}
