
package ex8;
import java.util.Scanner;

class Exercice8 {
  public static void main(String[] args) { 

    /*Ex 08
 Calculer le nombre de jeunes.
 Il s’agit de dénombrer toutes les personnes d'âge inférieur strictement à vingt ans
 parmi un échantillon donné de vingt personnes. Les personnes saisissent leur âge sur
 le clavier. */
 // Donc il faut faire saisir au 20 personne leur age 
 //On va stocker l'age dans une variable temporaire 
 //Ensuite il faut que selon l'age on tris
 // moins de 20 ans pour l'exercice 07 ensuite 
  // boucle 20 fois
  // si age > 20 alors jeune +1 
  //si age < 20 alors rien 
  // affiche le nombre de jeune a la fin 
  /////////
  ///VAR///
  ////////
    int age = 0;
    int jeune = 0;
    int plus = 0;

/// je peux ecrire des truc sans te gener ? 
  ////////
  ////////
  ////////
    Scanner sc = new Scanner(System.in);
    //faut pas utiliser la variable sc 
     

  for(int i = 1; i <= 20; i++){
    System.out.println("Tour" + i);
     age = sc.nextInt(); 
     if(age < 21){
       jeune++;
     }else{
       System.out.println(" plus de 20 ans  ");
      
     }
    System.out.println("tour : " + jeune);
  }
     

  }}