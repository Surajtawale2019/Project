
import java.util.Scanner;

interface I1
{
    void username();
}
interface I2
{
    void username();
}

public class Signup implements I1,I2		// Implementing Class
{
	Scanner sc = new Scanner(System.in);
	Anime z = new Anime();
	private String firstName;
	private String lastName;
	private String Username;
	private String Pass1;

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getUserName() 
	{
		return Username;
	}

	public void setUserName(String username) 
	{
		this.Username = username;
	}

	public String getPass1() 
	{
		return Pass1;
	}
 
	public void setPass1(String pass1) 
	{
		this.Pass1 = pass1;
	}
	
	@Override
	public String toString() 
	{
		return "!!!!!   Registration SuccessFul !!!!!" +"\n Name     :- "+ firstName+""+lastName + "\n Username :- " + Username + "\n Password :- " + Pass1 ;
	}

	@Override			// overriding interface 
	public void username() 
	{
		System.out.println("");
		System.out.println("Enter To Login Details :- ");
		System.out.println("==============================================================");

		System.out.println("Enter Username: ");
		String un = sc.next();
		System.out.println("Enter Password: ");
		String ps = sc.next();
		
//		for(int i=0;i<3;i++) { for only entering password 3times
		
		if (un.equals(Username) && ps.equals(Pass1))
		{
			System.out.println("");
			System.out.println("");
			
	            System.out.println("|**********************************************************|");
	            System.out.println("|                                                          |");
	            System.out.println("|                  LOGIN SUCCESSFUL                        |");
	            System.out.println("|                =====================           		   |");
	            System.out.println("|                                                          |");
	            System.out.println("|                                                          |");
	            System.out.println("|**********************************************************|");
	            System.out.println("");
	            System.out.println("");
	            System.out.println("	Welcome To The Anime World " + firstName+" "+lastName);
	            System.out.println("");
	            System.out.println("");
	            System.out.println("|**********************************************************|");
	            System.out.println("|         !!!  You Are Now Part Of The Anime World !!!     |");
	            System.out.println("|                                                          |");
	            System.out.println("|           PLEASE SELECT THE PARTICULAR CATEGORY          |");
	            System.out.println("|          ========================================        |");
	            System.out.println("|                                                          |");
	            System.out.println("|                                                          |");
	            System.out.println("|**********************************************************|");
			
			
			
	            System.out.println("===============================================================");
	            System.out.println("");
	            System.out.println("");
			
			

		}
		else 
		{
			System.out.println("====================================================================");
			System.out.println("");
			System.out.println("\nYou don't have access");
			System.out.println("");
			System.out.println("=======================================");
			username();
		}
//		i++;
//	}

	}


}
