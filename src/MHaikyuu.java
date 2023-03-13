import java.util.Scanner;

public class MHaikyuu extends Movies
{
	public void typeOfAMovie() 
	{
		
		  String Type="Movies";
		  String Plot="Haikyuu Recap ";
		  String Genre="  Comedy, Drama, School, Shounen, Sports";
		  int Released=2015;
		  String Status="Completed";
		  String Other="Haikyuu Recaped from 1 to 24 Episode";
		  int Ep=01;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println(" Haikyuu VollyBall Movie     " );
		  System.out.println("");
		  System.out.println("Type :              " +Type);
		  System.out.println("Plot Summary :      " +Plot);
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  
		  System.out.println("Genre :             " +Genre);
		  System.out.println("Releasde On :       " +Released);
		  System.out.println("Status :            " +Status);
		  System.out.println("Total Episodes :    " +Ep);
		  System.out.println("Japnese Name:       " +Other);
	
		  
		  
		  System.out.println();
		  System.out.println();
		  System.out.println("*************************************************************");
		  System.out.println("Press 1 to Watch Dub");
		  System.out.println("Press 1 to Watch Sub");
		  System.out.println("Press 3 to go back to Previous menu");
		  System.out.println("Press 4 for Home Page");
		  
		  Scanner sc=new Scanner(System.in);
 	      int i= sc.nextInt();
 	      
 	   switch(i)
 	   {
			case 1:
				System.out.println("https://www1.gogoanimes.fi/category/haikyuu-movie-1-owari-to-hajimari-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 MHaikyuu h  = new MHaikyuu();
					 h.typeOfAMovie();
				 }
				 else if(x2==2)
				 {
					 Anime a1 = new Anime();
					 a1.watch(); 
				 }
				 else if(x2==3)
				 {
					 Stop s = new Stop();
			 		  s.stop(); 
				 }
				 else
				 {
					System.out.println("Enter valid number!!");
					MHaikyuu h  = new MHaikyuu();
					 h.typeOfAMovie();
				 }
				
				break;
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/haikyuu-movie-1-owari-to-hajimari");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 MHaikyuu h  = new MHaikyuu();
					 h.typeOfAMovie();
				 }
				 else if(x1==2)
				 {
					 Anime a1 = new Anime();
					 a1.watch(); 
				 }
				 else if(x1==3)
				 {
					 Stop s = new Stop();
			 		  s.stop(); 
				 }
				 else
				 {
					System.out.println("Enter valid number!!");
					MHaikyuu h  = new  MHaikyuu();
					 h.typeOfAMovie();
				 }
				
				break;
				
			case 3:
				 Movies h  = new Movies();
				 h.typeOfAMovie();
				 break;
				
			case 4:
				 Anime a = new Anime();
				 a.watch();
				 break;
				 
			default:
				System.out.println("Please Enter a valid Number");
				MHaikyuu o =new MHaikyuu();
			 	   o.typeOfAMovie();
		}
	}
}
