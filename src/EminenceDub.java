import java.util.Scanner;

public class EminenceDub extends Dub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2022 Anime";
		  String Plot="For as long as he can remember, Minoru Kagenou has been fixated on becoming as strong as possible, which has led him to undertake all kinds of rigorous training. This wish, however, does not stem from a desire to be recognized by others; rather, Minoru does everything he can to blend in with the crowd. So, while pretending to be a completely average student during the day, he arms himself with a crowbar and ruthlessly thrashes local biker gangs at night. Yet when Minoru finds himself in a truck accident, his ambitions seemingly come to a sudden end. In his final moments, he laments his powerlessness—no matter how much he trained, there was nothing he could do to overcome his human limitations. But instead of dying, Minoru reawakens as Cid, the second child of the noble Kagenou family, in another world—one where magic is commonplace. With the power he so desired finally within his grasp, he dons the moniker \"Shadow\" and establishes Shadow Garden: a group whose sole purpose is to combat the enigmatic Cult of Diablos, an organization born from Cid's imagination. However, as Shadow Garden grows in both membership and influence, it becomes increasingly apparent that the Cult of Diablos is not as fictional as Cid had intended.";
		  String Genre="Comedy, Romance, Slice of Life\r\n";
		  int Released=2022;
		  String Status="Ongoing";
		  String Other=" The Eminence in Shadow, 陰の実力者になりたくて！";
		  int Ep=12;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("The Eminence in Shadow Dub     " );
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
				System.out.println("https://www1.gogoanimes.fi/category/kage-no-jitsuryokusha-ni-naritakute-dub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				
				 System.out.println("Press 1 for Previous Menu");
				 System.out.println("Press 2 for Home");
				 System.out.println("Press 3 for Exit");
				 System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 EminenceDub h  = new EminenceDub();
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
					EminenceDub h  = new EminenceDub();
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
