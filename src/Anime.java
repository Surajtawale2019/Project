import java.util.Scanner;

public class Anime 
{	
	static 
	{
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("!!!!!	Welcome to The Anime World	!!!!!");
		System.out.println("");
		System.out.println("You will never be able to love anybody else until you love yourself");
		System.out.println("");
		System.out.println("************************************************************************");
		System.out.println("");
	}
	
	//for watch
	
	public void watch() 
	{
		System.out.println("");
		System.out.println("");
		System.out.println("Press 1 for Home");
		System.out.println("Press 2 for New Season");
		System.out.println("Press 3 for Movies");
		System.out.println("Press 4 for Popular");
		System.out.println("Press 5 for Genre");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		//Switch case for selecting menu
		switch(i)
		{
		case 1:
			Home h = new Home();
			h.typeOfAnime();
			break;
			 
		case 2:
			NewSeason s = new NewSeason();
			s.typeOfANew();
			 break;
			 
		case 3:
			Movies m = new Movies();
			m.typeOfAMovie();
			 break;
			 
		case 4:
			Popular q = new Popular();
			q.typeOfAPopul();
			break;
		
		case 5:
			Genre g = new Genre();
			g.typeOfAGenre();
			break;
		
			 
		default:
			System.out.println("Please Enter a valid choice");
			Anime a1=new Anime();
			a1.watch();
		}
}
//	public void in()
//	{
//		Signup s1 = new Signup();
//
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter firstName: ");
//		String firstName = sc.nextLine();
//		s1.setFirstName(firstName);
//
//		System.out.println("Enter lastName: ");
//		String lastName = sc.nextLine();
//		s1.setLastName(lastName);
//
//		System.out.println("Enter Your Username :-");
//        String Username=sc.next();
//        s1.setUserName(Username);
//        
//        System.out.println("Enter your Password :-");
//        String Pass=sc.next();
//        s1.setPass1(Pass);
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.println(s1.toString());
//        System.out.println("");
//        System.out.println("");
//        
//        System.out.println("");
//    	  System.out.println("");
//		  System.out.println("|**********************************************************|");
//        System.out.println("|                                                          |");
//        System.out.println("|                  REGISTRATION SUCCESSFUL                 |");
//        System.out.println("|                ===========================               |");
//        System.out.println("|                                                          |");
//        System.out.println("|                                                          |");
//        System.out.println("|**********************************************************|");
//        System.out.println("");
//        System.out.println("");
//	}
	
	
	public static void main(String[] args) 
	{
		Anime u = new Anime();
		Signup s1 = new Signup();
//		Signup s1 = new Signup();


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firstName: ");
		String firstName = sc.nextLine();
		s1.setFirstName(firstName);

		System.out.println("Enter lastName: ");
		String lastName = sc.nextLine();
		s1.setLastName(lastName);

		System.out.println("Enter Your Username :-");
        String Username=sc.next();
        s1.setUserName(Username);
        
        System.out.println("Enter your Password :-");
        String Pass=sc.next();
        s1.setPass1(Pass);
        
        System.out.println("");
        System.out.println("");
        System.out.println(s1.toString());
        System.out.println("");
        System.out.println("");
			
//		 s1.username();
			
	        	System.out.println("");
	        	System.out.println("");
				System.out.println("|**********************************************************|");
	            System.out.println("|                                                          |");
	            System.out.println("|                  REGISTRATION SUCCESSFUL                 |");
	            System.out.println("|                ===========================               |");
	            System.out.println("|                                                          |");
	            System.out.println("|                                                          |");
	            System.out.println("|**********************************************************|");
	            System.out.println("");
	            System.out.println("");
	        
	       
	            System.out.println("===================================================================");
	            
	            
//	            System.out.println("press 1 for edit ");
//	            System.out.println("press 2 to continue ");
//	            Scanner sc = new Scanner(System.in);
//	            int a = sc.nextInt();
//	            switch(a)
//	            {
//	            case 1:
//	            	Anime u1 = new Anime();
//	            	u1.in();
//	            	break;
//	            case 2:
//	            	s1.username();
//	            	break;
//	            default :
//	            	System.out.println("Enter Validate Input");
//	            }
	            
//	            u.in();
	            
	            s1.username();
	            
	            u.watch();
	            
	           
	            
//	            I2 ref = new Signup();
//	            ref.username();
     
	}

}
