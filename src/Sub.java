import java.util.Scanner;

public class Sub extends Home
{
	public void typeOfAnime()
	{
		
		System.out.println("You have selected Sub");
		System.out.println();
		
		
		System.out.println("Select the Sub Anime You Want To Watch :- ");
		
		System.out.println("Press 1 to select Naruto");
		System.out.println("Press 2 to select OnePiece");
		System.out.println("Press 3 to select Demon Slayer");
		System.out.println("Press 4 to select My Hero Academiya");
		System.out.println("Press 5 to select Bleach");
		System.out.println("Press 6 to select Jujutsu Kaisen");
		System.out.println("Press 7 to select Chainsaw Man");
		System.out.println("Press 8 to select  Don't Toy with Me");
		System.out.println("Press 9 to select  The Eminence in Shadow;");
		System.out.println("Press 10 to select Welcome to Demon School! Iruma-kun");
		System.out.println();
		System.out.println();
		System.out.println("Press 0 to go back to main menu "); 
		
		
		Scanner sc=new Scanner(System.in);
 	    int i= sc.nextInt();
 	   
 	   switch(i) 
 	   {
			case 1:
				NarutoSub n = new NarutoSub();
				n.typeOfAnime();
				break;
			
			case 2:
				OnePieceSub o = new OnePieceSub();
				o.typeOfAnime();
				break;
			
			case 3:
				DemonSlayerSub d = new DemonSlayerSub();
				d.typeOfAnime();
			break;
			
			case 4:
				MyHeroSub h = new MyHeroSub();
				h.typeOfAnime();
				break;
			
			case 5:
				BleachSub b = new BleachSub();
				b.typeOfAnime();
				break;
				
			case 6:
				JujutsuSub j = new JujutsuSub();
				j.typeOfAnime();
				break;
				
			case 7:
				ChainsawSub c = new ChainsawSub();
				c.typeOfAnime();
				break;
				
			case 8:
				DontSub m = new DontSub();
				m.typeOfAnime();
				break;
				
			case 9:
				EminenceSub e = new EminenceSub();
				e.typeOfAnime();
				break;
		
			case 10:
				IrumaSub k = new IrumaSub();
				k.typeOfAnime();
				break;
			 
			case 0:
				Anime a=new Anime();
				a.watch();
				break;
				
			default:
				Anime a1=new Anime();
				a1.watch();
 	   }
	}
}
