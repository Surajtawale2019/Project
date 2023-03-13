import java.util.Scanner;

public class MHighS extends Movies
{
	public void typeOfAMovie() 
	{
		
		  String Type="Movies";
		  String Plot="The story follows Issei Hyodo, a dim-witted, lecherous second-year high school student who is killed by a girl on his first date ever. Issei is reincarnated as a devil";
		  String Genre="  Comedy, Demons, Harem, Romance, School, Shounen";
		  int Released=2012;
		  String Status="Completed";
		  String Other="High School DXD";
		  int Ep=01;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println(" High School DXD Movie     " );
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
				System.out.println("https://www1.gogoanimes.fi/category/high-school-dxd-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 MHighS h  = new  MHighS();
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
					MHighS h  = new  MHighS();
					 h.typeOfAMovie();
				 }
				
				break;
			
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/high-school-dxd");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 MHighS h  = new  MHighS();
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
					MHighS h  = new  MHighS();
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
				MHighS o =new MHighS();
			 	   o.typeOfAMovie();
		}
	}	 	
			

}
