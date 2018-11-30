import java.util.Scanner;

public class test2
{   
     public static void main(String []args){

     }

     public int entree()
     {
          Scanner clavier = new Scanner(System.in);
          System.out.println("Entrez un entier :");
          int monEntier = clavier.nextInt();
          clavier.close();
          return monEntier;
     }
}