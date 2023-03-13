import java.util.Scanner;

public class GIsekai extends Genre
{
	public void typeOfAGenre() 
	{
		System.out.println("You Have Selected Isekai Genre !!!!!!");
	   System.out.println("=============================================");
	   System.out.println("Please Select the Type :- ");
	   System.out.println("Press 1 to select Tsukimichi: Moonlit Fantasy");
	   System.out.println("Press 2 to select  Parallel World Pharmacy");
	   System.out.println("Press 3 to select Farming life in another world");
	   System.out.println("Press 4 to select Campfire Cooking in Another World with My Absurd Skil");
	   System.out.println();
	   System.out.println("Press 5 to go Back Previous Menu");
	   System.out.println("Press 6 to go Back Home Menu");
	   System.out.println("=============================================");
	   System.out.println();
	   
	   
	   Scanner sc=new Scanner(System.in);
    	int i= sc.nextInt();
		   
		switch(i) 
		 {
		case 1:
			GIMoonlit g= new GIMoonlit();
			g.typeOfAGenre();
			 break;
			 
		case 2:
			GIPara n = new GIPara();
			n.typeOfAGenre();
			break;
			
		case 3:
			GIFarm n1 = new GIFarm();
			n1.typeOfAGenre();
			break;
			
		case 4:
			GICook n2 = new GICook();
			n2.typeOfAGenre();
			break;
			
		case 5:
			Genre g1 = new Genre();
			g1.typeOfAGenre();
			break;
			 
		case 6: 
			Anime a=new Anime();
			a.watch();
			break;
			
		default:
			Genre g2 = new Genre();
			g2.typeOfAGenre();
			break;

		 }
//		 Stop s = new Stop();
//		 s.stop();

	}
}
