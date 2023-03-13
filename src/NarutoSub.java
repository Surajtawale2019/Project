import java.util.Scanner;

public class NarutoSub extends Sub
{
	public void typeOfAnime() 
	{
		
		  String Type="TV Series";
		  String Plot="\r\n";
		  String Genre="Action, Comedy, Martial Arts, Shounen, Super Power";
		  int Released=2002;
		  String Status="Completed";
		  String Other="ナルト";
		  int Ep=220;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Naruto Sub     " );
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
				System.out.println("https://ww3.gogoanime2.org/anime/naruto-sub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 NarutoSub h  = new NarutoSub();
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
					NarutoSub h  = new NarutoSub();
					 h.typeOfAnime();
				 }
				
				break;
				 
			case 2:
				 Sub h  = new Sub();
				 h.typeOfAnime();
				 break;
				
			case 3:
				 Anime a = new Anime();
				 a.watch();
				 break;
				 
			default:
				System.out.println("Please Enter a valid Number");
				NarutoSub h1  = new NarutoSub();
				 h1.typeOfAnime();
		}
	}

}
