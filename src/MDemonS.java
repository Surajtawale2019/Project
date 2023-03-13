import java.util.Scanner;

public class MDemonS extends Movies
{
	public void typeOfAMovie() 
	{
		
		  String Type="Movies";
		  String Plot="A mysterious string of disappearances on a certain train has caught the attention of the Demon Slayer Corps, and they have sent one of their best to exterminate what can only be a demon responsible. However, the plan to board the Mugen Train is delayed by a lesser demon who is terrorizing the mechanics and targeting a kind, elderly woman and her granddaughter. Kyoujurou Rengoku, the Flame Pillar, must eliminate the threat before boarding the train. Sent to assist the Pillar, Tanjirou Kamado, Inosuke Hashibira, and Zenitsu Agatsuma enter the train prepared to fight. But their monstrous target already has a devious plan in store for them and the two hundred passengers: by delving deep into their consciousness, the demon intends to obliterate everyone in a stunning display of the power held by the Twelve Demon Moons."; 
		  String Genre="Action, Comedy, Martial Arts, Shounen, Super Power";
		  int Released=2021;
		  String Status="Completed";
		  String Other="Demon Slyer : Mugan Train Arc";
		  int Ep=01;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Demon Slyer Movie      " );
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
				System.out.println("https://www1.gogoanimes.fi/category/kimetsu-no-yaiba-mugen-ressha-hen-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 MDemonS h  = new  MDemonS();
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
					MDemonS h  = new MDemonS();
					 h.typeOfAMovie();
				 }
				
				break;
			
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/kimetsu-no-yaiba-mugen-ressha-hen");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 MDemonS h  = new MDemonS();
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
					MDemonS h  = new  MDemonS();
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
				MDemonS o =new MDemonS();
			 	   o.typeOfAMovie();
		}
 	   
	}
}
