import java.util.Scanner;

public class MyHeroDub extends Dub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2020 Anime";
		  String Plot=" Midoriya Izuku was just a regular middle school student in a world where people with superpowers known as Quirks are the norm. However, he dreams of one day becoming a Hero, despite being bullied by his classmates for not having a Quirk. After being the only one to try and save his childhood friend, Katsuki, from a Villain, All Might, the world's greatest Hero, bestows upon him his own quirk, One For All. The story follows Izuku's entrance into Yuuei High School, a school that cultivates the next generation of Heroes.\r\n";
		  String Genre="Action , Comedy , School , Shounen , Super Power";
		  int Released=2016;
		  String Status="Completed";
		  String Other=" My Hero Academia , 僕のヒーローアカデミア";
		  int Ep=26;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println(" My Hero Academia Dub     " );
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
				System.out.println("https://ww3.gogoanime2.org/anime/boku-no-hero-academia-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 MyHeroDub h  = new MyHeroDub();
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
					MyHeroDub h  = new MyHeroDub();
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
				MyHeroDub h1  = new MyHeroDub();
				 h1.typeOfAnime();
		}
	}

}
