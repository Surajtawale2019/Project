import java.util.Scanner;

public class Dub extends Home
{
	public void typeOfAnime()
	{
		
		System.out.println("You have selected Dub");
		System.out.println();
		
		
		System.out.println("Select the Anime You Want To Watch :- ");
		
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
				NarutoDub n = new NarutoDub();
				n.typeOfAnime();
				break;
			
			case 2:
				OnePieceDub o = new OnePieceDub();
				o.typeOfAnime();
				break;
			
			case 3:
				DemonSlayerDub d = new DemonSlayerDub();
				d.typeOfAnime();
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
				IrumaDub k = new IrumaDub();
				k.typeOfAnime();
				break;
			 
			case 0:
				Home z = new Home();
				z.typeOfAnime();
				break;
				
			default:
				Dub d1 = new Dub();
				d1.typeOfAnime();
 	   }
	}
}
