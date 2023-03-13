import java.util.Scanner;

public class GRKomi extends GRomance
{
	public void typeOfAGenre() 
	{
		
		  String Type="Tv Series";
		  String Plot="Synopsis Hitohito Tadano is an ordinary boy who heads into his first day of high school with a clear plan: to avoid trouble and do his best to blend in with others. Unfortunately, he fails right away when he takes the seat beside the school's madonna—Shouko Komi. His peers now recognize him as someone to eliminate for a chance to sit next to the most beautiful girl in class";
		  String Genre= "Comedy, School, Shounen, Slice of Life";
		  int Released=2021;
		  String Status="Completed";
		  String Other=" Komi Can't Communicate, 古見さんは、コミュ症です";
		  int Ep=12;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Romance Anime Komi Can't Communicate   " );
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
		  System.out.println();
		  
		  Scanner sc=new Scanner(System.in);
 	      int i= sc.nextInt();
 	      
 	   switch(i)
 	   {
			case 1:
				System.out.println("https://www1.gogoanimes.fi/category/komi-san-wa-comyushou-desu-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 GRKomi h  = new GRKomi();
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
					GRKomi h  = new GRKomi();
					 h.typeOfAGenre();
				 }
				
				break;
			
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/komi-san-wa-comyushou-desu");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 GRKomi h  = new GRKomi();
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
					GRKomi h  = new GRKomi();
					 h.typeOfAGenre();
				 }
				
				break;
				
			case 3:
				 Genre h  = new Genre();
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
