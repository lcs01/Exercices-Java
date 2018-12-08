package switchdemo;
import java.util.Scanner;
public class SWITCHDEMO {

	public static void main (String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
	// variable String est demo et est égale a "lol"
    int demo = sc.nextInt();
  //type de variable 
	switch(demo)  {
	 printf("lol");
	String solo = "mode"; 
	//(variable crée avec le  switch)(equivalent de si ) 
	case "+" : 
	//(la ou mettre son operation >>> dans la variable)
	 System.out.println("1");
	// pour 	arreter une opération dans un switch
	break;

	// demarrer une nouvelle operation 
	case "/" : 
		 System.out.println("ll");
	/// pour arreter une opération dans le switch 
	break; 
	
	case "lol": 
		System.out.println("llollllllll");
		break; 
		
	case "SWITCHMODE": 
		// scan la saisie dans la variable sc 
		Scanner sc = new Scanner(System.in); 
		System.out.println("YES");
		
		// si il est écrit mode 
	case (solo): 
		System.out.println("YES");

	//equivalent de else (sinon) 
	default: 
	 System.out.println("llll");
	}

}
}