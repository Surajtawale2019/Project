import java.util.Scanner;

public class DontDub extends Dub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2021 Anime";
		  String Plot=" High schooler Hayase Nagatoro loves to spend her free time doing one thing, and that is to bully her Senpai! After Nagatoro and her friends stumble upon the aspiring artist's drawings, they find enjoyment in mercilessly bullying the timid Senpai. Nagatoro resolves to continue her cruel game and visits him daily so that she can force Senpai into doing whatever interests her at the time, especially if it makes him uncomfortable. Slightly aroused by and somewhat fearful of Nagatoro, Senpai is constantly roped into her antics as his interests, hobbies, appearance, and even personality are used against him as she entertains herself at his expense. As time goes on, Senpai realizes that he doesn't dislike Nagatoro's presence, and the two of them develop an uneasy friendship as one patiently puts up with the antics of the other.\r\n";
		  String Genre="Comedy, Romance, Slice of Life";
		  int Released=2021;
		  String Status="Completed";
		  String Other=" Don't Toy with Me, Miss Nagatoro, Please don't bully me, Nagatoro, イジらないで、長瀞さん\r\n";
		  int Ep=12;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Don't Toy with Me, Miss Nagatoro Dub     " );
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
		  System.out.println("Press 1 to Watch");
		  System.out.println("Press 2 for Previous Menu");
		  System.out.println("Press 3 to go back to main menu");

		  
		  Scanner sc=new Scanner(System.in);
 	      int i= sc.nextInt();
 	      
 	   switch(i)
 	   {
			case 1:
				System.out.println("https://www1.gogoanimes.fi/category/ijiranaide-nagatoro-san-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 DontDub h  = new DontDub();
					 h.typeOfAnime();
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
					DontDub h  = new DontDub();
					 h.typeOfAnime();
				 }
				
				break;
			
			case 2:
				 Dub h  = new Dub();
				 h.typeOfAnime();
				 break;	
				
			case 3:
				 Anime a = new Anime();
				 a.watch();
				 break;
				 
			default:
				System.out.println("Please Enter a valid Number");
		}
	}

}
