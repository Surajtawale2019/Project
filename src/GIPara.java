import java.util.Scanner;

public class GIPara extends GIsekai
{
	
	public void typeOfAGenre() 
	{
		
		  String Type="Summer 2021 Anime";
		  String Plot=" After losing his little sister to an incurable disease, world-famous medical researcher Kanji Yakutani gave it his all to cure patients by dedicating his life to inventing new medicines. After working himself to death at the age of 31, the former pharmacist wakes up as a 10-year-old child whose body has been struck by lightning. He discovers that he has been reincarnated into a medieval world as Falma, a child of the respected De Médicis family. In a world where divine arts—magic granted through blessings from guardian deities—exist, Falma realizes that his body is host to the guardian deity of medicine. The boy has been granted the mythical divine arts of creation and reduction as well as the ability to instantly diagnose illnesses in people's bodies. He soon discovers the terrible state of medicine in this world: only nobles are able to afford medical care, which is ineffective at best and detrimental at worst. Using modern knowledge and his divine powers, Falma gradually makes a name for himself as a pharmacist despite his young age, even earning the recognition of the imperial court. When he finally acquires a proper pharmacy of his own, he sets out to pursue his goal of improving healthcare in the San Fleuve Empire and making it accessible to all.";
		  String Genre="Fantasy, Isekai, Medical";
		  int Released=2022;
		  String Status="Completed";
		  String Other="Parallel World Pharmacy; 異世界薬局 ; Alternate World Pharmacy";
		  int Ep=12;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Isekai  Anime Parallel World Pharmacy    " );
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
				System.out.println("https://www1.gogoanimes.fi/category/isekai-yakkyoku-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 GIPara h  = new GIPara();
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
					GIPara h  = new GIPara();
					 h.typeOfAGenre();
				 }
				
				break;
				
			case 2:
				System.out.println("https://www1.gogoanimes.fi/category/isekai-yakkyoku");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				System.out.println("");
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x2= sc.nextInt();
				 if(x2==1)
				 {
					 GIPara h  = new GIPara();
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
					GIPara h  = new GIPara();
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
