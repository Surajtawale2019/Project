import java.util.Scanner;

public class Genre extends Anime
{
	public void typeOfAGenre()
	{
		
		System.out.println("You have selected Genres!!!!!!!");
		System.out.println();
		
		
		System.out.println("Select the Genre You Want To Watch :- ");
		
		System.out.println("Press 1 to select Romance");
		System.out.println("Press 2 to select Comedy");
		System.out.println("Press 3 to select Horror");
		System.out.println("Press 4 to select Isekai");
		System.out.println();
		System.out.println();
		
		
		Scanner sc=new Scanner(System.in);
 	    int i= sc.nextInt();
 	   
 	   switch(i) 
 	   {
			case 1:
				GRomance n = new GRomance();
				n.typeOfAGenre();
				break;
			
			case 2:
				GComedy o = new GComedy();
				o.typeOfAGenre();
				break;
			
			case 3:
				GHorror d = new GHorror();
				d.typeOfAGenre();
			break;
			
			case 4:
				GIsekai h = new GIsekai();
				h.typeOfAGenre();
				break;
				
//			case 5:
//				GAction h1 = new GAction();
//				h.typeOfAnime();
//				break;
//				
//			case 6:
//				GAction h2 = new GAction();
//				h.typeOfAnime();
//				break;
				
			default:
				Anime a=new Anime();
				a.watch();
 	   }
	}
}
