import java.util.Scanner;

public class MNaruto extends Movies
{
	public void typeOfAMovie() 
	{
		
		  String Type="Movies";
		  String Plot=" The moon is beginning to fall, and at the rate it's going, it is doomed to fall on the Earth. The countdown for the survival of the planet begins. Among the havoc, Hinata's younger sister Hanabi is captured by the mysterious enemy, Toneri Ootsutsuki. Naruto must overcome great danger on a mission to save Hanabi and the world along with Hinata, Sai, Shikamaru, and Sakura is their final story. \"The final story is a first love.";
		  String Genre="Action, Comedy, Martial Arts, Shounen, Super Power";
		  int Released=2014;
		  String Status="Completed";
		  String Other=" The Last: Naruto the Movie, THE LAST NARUTO THE MOVIE";
		  int Ep=01;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Naruto Movie     " );
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
		  System.out.println("Press 2 to Watch Sub");
		  System.out.println("Press 3 to go back to Previous menu");
		  System.out.println("Press 4 for Home Page");
		  
		  Scanner sc=new Scanner(System.in);
 	      int i= sc.nextInt();
 	      
 	   switch(i)
 	   {
			case 1:
				System.out.println("https://www1.gogoanimes.fi/category/the-last-naruto-the-movie-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 MNaruto h  = new MNaruto();
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
					MNaruto h  = new  MNaruto();
					 h.typeOfAMovie();
				 }
				
				break;
			
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/the-last-naruto-the-movie-sub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 MNaruto h  = new MNaruto();
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
					MNaruto h  = new MNaruto();
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
				MNaruto o =new MNaruto();
			 	   o.typeOfAMovie();
		}
	}
}
