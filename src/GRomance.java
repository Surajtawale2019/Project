import java.util.Scanner;

public class GRomance extends Genre
{
	public void typeOfAGenre() 
	{
		System.out.println("You Have Selected Romance Genre !!!!!!");
	   System.out.println("=============================================");
	   System.out.println("Please Select the Type :- ");
	   System.out.println("Press 1 to select Nagatore");
	   System.out.println("Press 2 to select The Quintessential Quintuplets");
	   System.out.println("Press 3 to select Komi san Can't Communicate");
	   System.out.println();
	   System.out.println("Press 4 to go Back Previous Menu");
	   System.out.println("Press 5 to go Back Home Menu");
	   System.out.println("=============================================");
	   System.out.println();
	   
	   
	   Scanner sc=new Scanner(System.in);
    	int i= sc.nextInt();
		   
		switch(i) 
		 {
		case 1:
			GRNaga f = new GRNaga();
			f.typeOfAGenre();
			 break;
			 
		case 2:
			GRQuin g = new GRQuin();
			g.typeOfAGenre();
			break;
			
		case 3:
			GRKomi g1 = new GRKomi();
			g1.typeOfAGenre();
			break;
			
		case 4:
			Genre g2 = new Genre();
			g2.typeOfAGenre();
			break;
			
		case 5:
			Anime a=new Anime();
			a.watch();
			break;
			 
			
		default:
			GRomance a1 = new GRomance();
			a1.watch();

		 }
	}
}
