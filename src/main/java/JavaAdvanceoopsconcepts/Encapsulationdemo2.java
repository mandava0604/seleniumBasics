package JavaAdvanceoopsconcepts;

public class Encapsulationdemo2 {
	
	
	public static void main(String[] args) {
	 
       Encapsulationdemo ed = new Encapsulationdemo();
       ed.setName("Relu");
       ed.setAge(25);
       ed.setCountry("USA");
       ed.perdetails();
       
       System.out.println("*************----***************");
     
       System.out.println("The country name is" +ed.getCountry());
    		   
	}

}
