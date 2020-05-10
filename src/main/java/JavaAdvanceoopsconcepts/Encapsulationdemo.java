package JavaAdvanceoopsconcepts;

public class Encapsulationdemo {
	
	private String name;
	private int age;
	private String country = "INDIA";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name.toUpperCase();
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
	this.country = country;
	}
	
	public void perdetails() {
		
		System.out.println("The Personal details is:" +name+"   "+age+"   "+country+"");
		
	}
	             		   
	}


