import java.util.Scanner;

public class GHorror extends Genre
{
	public void typeOfAGenre() 
	{
		System.out.println("You Have Selected Horror Genre !!!!!!");
	   System.out.println("=============================================");
	   System.out.println("Please Select the Type :- ");
	   System.out.println("Press 1 to select The Moment the Cicadas Cry");
	   System.out.println("Press 2 to select The Promised Neverland");
	   System.out.println("Press 3 to select TOKYO GHOUL");
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
			GHCicadas g= new GHCicadas();
			g.typeOfAGenre();
			 break;
			 
		case 2:
			GHPromise n = new GHPromise();
			n.typeOfAGenre();
			break;
			
		case 3:
			GHTokyo n1 = new GHTokyo();
			n1.typeOfAGenre();
			break;
			
		case 4:
			Genre g1 = new Genre();
			g1.typeOfAGenre();
			break;
			 
		case 5: 
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
