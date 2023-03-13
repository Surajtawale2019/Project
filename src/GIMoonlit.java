import java.util.Scanner;

public class GIMoonlit extends GIsekai
{
	
	public void typeOfAGenre() 
	{
		
		  String Type=" Summer 2021 Anime";
		  String Plot="	 As part of a mysterious contract agreed upon by a goddess and his parents years ago, Makoto Misumi finds himself sent to another world to meet the goddess and become the hero. However, the deity deems Makoto to be \"hideous,\";	  ";
		  String Genre="  Action, Adventure, Comedy, Fantasy, Isekai";
		  int Released=2021;
		  String Status="Completed";
		  String Other=" Tsukimichi: Moonlit Fantasy";
		  int Ep=12;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Isekai  Anime  Tsukimichi: Moonlit Fantasy    " );
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
				System.out.println("https://www1.gogoanimes.fi/category/tsuki-ga-michibiku-isekai-douchuu-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 GIMoonlit h  = new GIMoonlit();
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
					GIMoonlit h  = new GIMoonlit();
					 h.typeOfAGenre();
				 }
				
				break;
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/tsuki-ga-michibiku-isekai-douchuu");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 GIMoonlit h  = new GIMoonlit();
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
					GIMoonlit h  = new GIMoonlit();
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
