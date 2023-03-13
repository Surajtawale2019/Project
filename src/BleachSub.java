import java.util.Scanner;

public class BleachSub extends Sub
{
	public void typeOfAnime() 
	{
		
		  String Type="Fall 2020 Anime";
		  String Plot="15-year-old Kurosaki Ichigo is not your everyday high school student. He has from as far he can remember always had the ability to see ghosts and spirits. A fateful day arrives as Ichigo encounters the shinigami Kuchiki Rukia, who saves him and his family from a Hollow at the cost of injuring herself. During this encounter, with Rukia unable to defeat the hollow she transfers her shinigami powers into Ichigo. In the aftermath, unable to continue with her job, Rukia allows Ichigo to take on the role of a shinigami in her place as they together defeat the Hollows plaguing Ichigo's town.\r\n";
		  String Genre="Action, Comedy, Shounen, Super Power , supernatural";
		  int Released=2004;
		  String Status="Completed";
		  String Other="BLEACH - ブリーチ -";
		  int Ep=366;
				  
		  System.out.println("Anime Info :-        ");
		  System.out.println("");
		  System.out.println("Bleach Sub     " );
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
				System.out.println("");
				System.out.println("https://ww3.gogoanime2.org/anime/bleach-sub");
				System.out.println("Copy Link And Paste One Browser!!!!");
				System.out.println("");
				System.out.println("Press 1 for Previous Menu");
				System.out.println("Press 2 for Home");
				System.out.println("Press 3 for Exit");
				System.out.println("");
				 
				 int x1= sc.nextInt();
				 if(x1==1)
				 {
					 BleachSub h  = new BleachSub();
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
					BleachSub h  = new BleachSub();
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
