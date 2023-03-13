import java.util.Scanner;

public class ChainsawDub extends Dub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2020 Anime";
		  String Plot="Denji has a simple dream—to live a happy and peaceful life, spending time with a girl he likes. This is a far cry from reality, however, as Denji is forced by the yakuza into killing devils in order to pay off his crushing debts. Using his pet devil Pochita as a weapon, he is ready to do anything for a bit of cash. Unfortunately, he has outlived his usefulness and is murdered by a devil in contract with the yakuza. However, in an unexpected turn of events, Pochita merges with Denji's dead body and grants him the powers of a chainsaw devil. Now able to transform parts of his body into chainsaws, a revived Denji uses his new abilities to quickly and brutally dispatch his enemies. Catching the eye of the official devil hunters who arrive at the scene, he is offered work at the Public Safety Bureau as one of them. Now with the means to face even the toughest of enemies, Denji will stop at nothing to achieve his simple teenage dreams.\r\n"; 
		  String Genre="Action, Gore, Shounen, Supernatural";
		  int Released=2022;
		  String Status="Ongoing";
		  String Other="チェンソーマン";
		  int Ep=10;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Chainsaw man Dub     " );
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
				System.out.println("https://www1.gogoanimes.fi/category/chainsaw-man-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 ChainsawDub h  = new ChainsawDub();
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
					ChainsawDub h  = new ChainsawDub();
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
