import java.util.Scanner;

public class GComedy extends Genre
{
	public void typeOfAGenre() 
	{
		System.out.println("You Have Selected Comedy Genre !!!!!!");
	   System.out.println("=============================================");
	   System.out.println("Please Select the Type :- ");
	   System.out.println("Press 1 to select Bleach");
	   System.out.println("Press 2 to select The Naruto");
	   System.out.println();
	   System.out.println("Press 3 to go Back Previous Menu");
	   System.out.println("Press 4 to go Back Home Menu");
	   System.out.println("=============================================");
	   System.out.println();
	   
	   
	   Scanner sc=new Scanner(System.in);
    	int i= sc.nextInt();
		   
		switch(i) 
		 {
		case 1:
			GCBleach g= new GCBleach();
			g.typeOfAGenre();
			 break;
			 
		case 2:
			GCNaruto n = new GCNaruto();
			n.typeOfAGenre();
			break;
			
		case 3:
			Genre g1 = new Genre();
			g1.typeOfAGenre();
			break;
			 
		default:
			Anime a=new Anime();
			a.watch();

		 }
		 Stop s = new Stop();
		 s.stop();

	}
}
