import java.util.Scanner;

public class Home extends Anime{
	
               public void typeOfAnime() {
            	   
            	   System.out.println("=============================================");
            	   System.out.println("Please Select the Type :- ");
            	   System.out.println("Press 1 to select Dub");
            	   System.out.println("Press 2 to select Sub");
            	   System.out.println();
            	   System.out.println("Press 3 to go Back");
            	   
            	   
            	   Scanner sc=new Scanner(System.in);
         	      	int i= sc.nextInt();
					   
					switch(i) 
					 {
					case 1:
						Dub d = new Dub();
						d.typeOfAnime();
						 break;
						 
					case 2:
						Sub s = new Sub();
						s.typeOfAnime();
						break;
						 
					default:
						Anime a=new Anime();
						a.watch();

     	
					   
            }
			
          }
}              
