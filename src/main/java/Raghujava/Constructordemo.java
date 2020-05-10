package Raghujava;

public class Constructordemo {
	String dbname ="SIt";
	String DBurl;
	String Usrname;
	String Paswrd;
	
   public Constructordemo() 
   {
	DBurl = "data123";
	Usrname = "name123";
	Paswrd = "password123";
   }
   
   public Constructordemo(String data111, String name111, String password111) 
   {
	   DBurl = "data111";
		Usrname = "name111";
		Paswrd = "password111";
   }
	
	public void datainput() 
	{
		System.out.println("Data input values are :"+dbname+" "+DBurl+" "+Usrname+" "+Paswrd+"");
	}
		 	 	
    public void datamain() 
    {
    	System.out.println("Data main values are :"+dbname+" "+DBurl+" "+Usrname+" "+Paswrd+"");
    }
    
    public void dataoutput() 
    {
    	System.out.println("Data output values are :"+dbname+" "+DBurl+" "+Usrname+" "+Paswrd+"");
    }
	}


