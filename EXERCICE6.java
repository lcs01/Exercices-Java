package ex6;

import java.util.Scanner;

class EXERCICE6 {
	public static void main(String[] args) {
	 
		int gitTestBranch=1;
		// scan une demande 
		Scanner sc = new Scanner(System.in);
		
		//ecrire "quel est le premier nombre?" 
		System.out.println("Quel est le premier nombre ?"); 
		// variable du premier nombre est égale à 
		int premiernombre = sc.nextInt();
		//ecrire "quel est le deuxieme nombre?" 
		System.out.println("Quel est le deuxieme nombre?");
		// variable du deuxieme nombre est égale à 
		int deuxiemenombre = sc.nextInt();
		// ecrire "quel est l'opérateur?"
		System.out.println("Quel est l'opérateur?");
        sc.nextLine();
        //variale operateur est égale à 
        String operateur= sc.nextLine();
        // si le premier et le deuxieme nombre sont plus grands que -1000 et plus petits que 1000
        if((premiernombre > -1000) && (premiernombre<1000) && (deuxiemenombre >-1000)&& (deuxiemenombre <1000) && (deuxiemenombre<1000)) {
        	
     	
       switch(operateur) {
       
       
       // nouvelle instruction si l'operateur est +  alors on additionne le premier et le deuxieme nombre
       case "+" : 
    	   System.out.println(premiernombre+deuxiemenombre); 
    	   
    	   //sortir du switch 
    	   break;
    	   
    	   // rentrer dans le switch on donne une nouvelle instruction si l'operateur est -  alors on soutrait le premier et le deuxieme nombre
       case"-":
    	   System.out.println(premiernombre-deuxiemenombre);
    	   
          //sortir du switch 
    	   break;
    	   // rentrer dans le switch et donne une nouvelle instruction si l'operateur est * alors on multiplie le premier et le deuxieme nombre  
       case"*":
    	   System.out.println(premiernombre*deuxiemenombre);
    	   
    	   //sortir du switch 
    	   break;
    	   
    	   // rentrer dans le switch et donner une nouvelle instruction si l'operateur est /  alors on divise le premier et le deuxieme nombre
    	   // si l'opérateur est et que le premier et le deuxieme nombre sont différents de 0 alors on écrit "division" 
       case"/":  if((premiernombre !=0) && (deuxiemenombre !=0))   {	   
    	   System.out.println(premiernombre/deuxiemenombre); 
    	
       }
       //sinon donner le resultat de premiernombre diviser par deuxieme nombre
       else {
    	   System.out.println("DIVISION ERROR");    
       }
       //sortir du switch case / 
       break ; 
       //sinon  si tout est faux (default) écrire "ERROR" et sortir de la fonction switch avec default + break 
  	 default : System.out.println("ERROR");
       
       }}
        
        //si les nombres sont supérieur a 1000 ou inférieur à -1000 effectuer l'addition premiernombre + deuxiemenombre. 
       else {
    	   System.out.println("ERROR LE CALCUL SERA ADDITIONNE =  " + (premiernombre+deuxiemenombre));
       }
        
        } 
   
	}
 

        
	 
	
       
        



        

// if else 
// case, verif, break 
