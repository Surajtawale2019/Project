import java.util.Scanner;

public class Popular extends Anime
{
	
	
	static
	{
		System.out.println("***************************************");
		System.out.println(" Popular Anime !!! ");
		System.out.println("***************************************");
	}
	
	public void typeOfAPopul()
	{
		
		System.out.println("You have selected new Popular Anime!!! ");
		System.out.println();
		
		
		System.out.println("Select the New Popular Anime Season You Want To Watch :- ");
		
		System.out.println("Press 1 to select NARUTO ");
		System.out.println("Press 2 to select Demon Slyer Movie  ");
		System.out.println("Press 3 to select (Demon Slyaer) ");
		System.out.println("Press 4 to select BOKU NO HERO ACADEMIA ");
		System.out.println("Press 5 to select BLEACH  ");
		System.out.println("Press 6 to select JUJUTSU KAISEN");
		System.out.println("Press 7 to select ChainSaw ");
		System.out.println("Press 8 to select Dont Toy With Me  ");
		System.out.println("Press 9 to select Eminence Of Shadow ");
		System.out.println("Press 10 to select One Piece Movie ");
		System.out.println();
		System.out.println();
		System.out.println("Press 11 for Home menu");
		
		Scanner sc=new Scanner(System.in);
 	    int i= sc.nextInt();
 	   
 	   switch(i) 
 	   {
 	  case 1:
			NarutoDub n = new NarutoDub();
			n.typeOfAnime();
			break;
		
		case 2:
			MDemonS d = new MDemonS();
			d.typeOfAMovie();
		break;
		
		case 3:
			DemonSlayerDub l = new DemonSlayerDub();
			l.typeOfAnime();
		break;
		
		case 4:
			MyHeroDub h = new MyHeroDub();
			h.typeOfAnime();
			break;
		
		case 5:
			BleachDub b = new BleachDub();
			b.typeOfAnime();
			break;
			
		case 6:
			JujutsuDub j = new JujutsuDub();
			j.typeOfAnime();
			break;
			
		case 7:
			ChainsawDub c = new ChainsawDub();
			c.typeOfAnime();
			break;
			
		case 8:
			DontDub m = new DontDub();
			m.typeOfAnime();
			break;
			
		case 9:
			EminenceDub e = new EminenceDub();
			e.typeOfAnime();
			break;
	
		case 10:
			MOnePiece o = new MOnePiece();
			o.typeOfAMovie();
			break;
			
		case 11:
			Anime a=new Anime();
			a.watch();
			
		default:
			System.out.println("Enter Valid Number");
			System.out.println("==================================");
			System.out.println("                                  ");
			Popular q = new Popular();
			q.typeOfAPopul();
			break;
 	   }
 	   
 	  
	}
}
