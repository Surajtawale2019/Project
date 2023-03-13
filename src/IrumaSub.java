import java.util.Scanner;

public class IrumaSub extends Sub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2019 Anime";
		  String Plot="Fourteen-year-old Iruma Suzuki has been unfortunate all his life, having to work to earn money for his irresponsible parents despite being underage. One day, he finds out that his parents sold him to the demon Sullivan. However, Iruma's worries about what will become of him are soon relieved, for Sullivan merely wants a grandchild, pampering him and making him attend the demon school Babyls. At first, Iruma tries to keep a low profile in fear of his peers discovering that he is human. Unfortunately, this ends up being more difficult than he expected. It turns out that Sullivan himself is the chairman of the school, and everyone expects him to become the next Demon King! Iruma immediately finds himself in an outrageous situation when he has to chant a forbidden spell in front of the entire school. With this, Iruma instantly earns a reputation he does not want. Even so, he is bound to be roped into more bizarre circumstances";
		  String Genre=" Comedy, Demons, Fantasy, School, Shounen, Supernatural\r\n";
		  int Released=2019;
		  String Status="Completed";
		  String Other="  Welcome to Demon School! Iruma-kun, 魔入りました！入間くん\r\n";
		  int Ep=24;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println(" Welcome to Demon School! Iruma-kun Sub     " );
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
				System.out.println("https://www1.gogoanimes.fi/category/mairimashita-iruma-kun\r\n");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 IrumaSub h  = new IrumaSub();
					 h.typeOfAnime();
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
					IrumaSub h  = new IrumaSub();
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
		}
	}

}
