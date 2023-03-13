import java.util.Scanner;

public class Movies extends Anime
{
	static
	{
		System.out.println("***************************************");
		System.out.println(" Anime Movies !!! ");
		System.out.println("***************************************");
	}
	
	public void typeOfAMovie()
	{
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
 	    int i= sc.nextInt();
 	   
 	   switch(i) 
 	   {
			case 1:
				MNaruto n = new MNaruto();
				n.typeOfAMovie();
				breSystem.out.println("You have selected Movies ");
		System.out.println();
		
		
		System.out.println("Select the Anime Movie You Want To Watch :- ");
		
		System.out.println("Press 1 to select NARUTO SHIPPUDEN MOVIE : THE LAST");
		System.out.println("Press 2 to select ONE PIECE FILM: RED ");
		System.out.println("Press 3 to select (Demon Slyaer) KIMETSU NO YAIBA: MUGEN RESSHA-HEN");
		System.out.println("Press 4 to select BOKU NO HERO ACADEMIA THE MOVIE: FUTARI NO HERO");
		System.out.println("Press 5 to select BLEACH MOVIE 1: MEMORIES OF NOBODY");
		System.out.println("Press 6 to select JUJUTSU KAISEN 0");
		System.out.println("Press 7 to select Attack On Titan MOVIE 1: GUREN NO YUMIYAe");
		System.out.println("Press 8 to select Death Note  ");
		System.out.println("Press 9 to select  HAIKYUU!! MOVIE 1: OWARI TO HAJIMARI");
		System.out.println("Press 10 to select High School DXD");
		System.out.println();
		System.out.println();ak;
			
			case 2:
				MOnePiece o = new MOnePiece();
				o.typeOfAMovie();
				break;
			
			case 3:
				MDemonS d = new MDemonS();
				d.typeOfAMovie();
			break;
			
			case 4:
				MMyHero h = new MMyHero();
				h.typeOfAMovie();
				break;
			
			case 5:
				MBleach b = new MBleach();
				b.typeOfAMovie();
				break;
				
			case 6:
				MJujutsu j = new MJujutsu();
				j.typeOfAMovie();
				break;
				
			case 7:
				MAttack c = new MAttack();
				c.typeOfAMovie();
				break;
				
			case 8:
				MDeath m = new MDeath();
				m.typeOfAMovie();
				break;
				
			case 9:
				MHaikyuu e = new MHaikyuu();
				e.typeOfAMovie();
				break;
		
			case 10:
				MHighS k = new MHighS();
				k.typeOfAMovie();
				break;
			 
			default:
				Anime a=new Anime();
				a.watch();
 	   }
	}
}
