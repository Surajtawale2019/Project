import java.util.Scanner;

public class GICook extends GIsekai
{
	
	public void typeOfAGenre() 
	{
		
		  String Type="Winter 2023 Anime";
		  String Plot="Along with three other heroes, 27-year-old Mukouda Tsuyoshi is transported into a fantasy world to rescue a kingdom from a mysterious threat. However, it soon becomes clear that Tsuyoshi has been dragged into the summoning ritual by accident. His only skill turns out to be \"Food Menu,\" which allows him to open an interface where he can purchase and obtain food-related supermarket items from modern Japan. Unceremoniously booted out of the palace";
		  String Genre="Adventure, Comedy, Fantasy, Gourmet, Isekai";
		  int Released=2022;
		  String Status="Ongoing";
		  String Other="Campfire Cooking in Another World with My Absurd Skill; Regarding the Display of an Outrageous Skill Which Has Incredible Powers ; とんでもスキルで異世界放浪メシ";
		  int Ep=1;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Isekai  Anime Campfire Cooking in Another World with My Absurd Skill    " );
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
		  System.out.println("Press 1 to Watch dub");
		  System.out.println("Press 2 to Watch sub");
		  System.out.println("Press 3 to go back to Previous menu");
		  System.out.println("Press 4 for Home Page");
		  System.out.println();
		  
		  Scanner sc=new Scanner(System.in);
 	      int i= sc.nextInt();
 	      
 	   switch(i)
 	   {
			case 1:
				System.out.println("https://www1.gogoanimes.fi/category/isekai-nonbiri-houka-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 GICook h  = new GICook();
					 h.typeOfAGenre();
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
					GICook h  = new GICook();
					 h.typeOfAGenre();
				 }
				
				break;
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/isekai-nonbiri-houka");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 GICook h  = new GICook();
					 h.typeOfAGenre();
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
					GICook h  = new GICook();
					 h.typeOfAGenre();
				 }
				
				break;
			
			case 3:
				 GIsekai h  = new GIsekai();
				 h.typeOfAGenre();
				 break;
				
			case 4:
				 Anime a = new Anime();
				 a.watch();
				 break;

				 
			default:
				System.out.println("Please Enter a valid Number");
				 
		}
// 	  Stop s = new Stop();
//		 s.stop();
 	
	}
}
