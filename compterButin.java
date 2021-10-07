import java.util.Scanner;
    public class compterButin
    {
     public static void main (String [] args)
     {
        int choix, add, mult, div, a, b;
         div = 0;
        do
        {
          Scanner scanner = new Scanner ( System . in ) ;
          choix = scanner.nextInt( );
          

          
          switch ( choix )
          {
            case 1 :
             System.out.println ("Veuillez saisir un nombre: " );
             a = scanner.nextInt( );
             System.out.print ("Veuillez saisir un deuxieme nombre: \n");
             b = scanner.nextInt( );
             add = a + b;
             System.out.println ("Le resultat est : "+ add);
             break;
             
            case 2 :
             System.out.println ("Veuillez saisir un nombre: \n");
             a = scanner.nextInt( );
             System.out.println ("Veuillez saisir un deuxieme nombre: \n");
             b = scanner.nextInt( );
             mult = a * b;
             System.out.println ("Le resultat est : "+ mult);
             break;
             
            case 3
 :
             System.out.println ("Veuillez saisir un nombre: \n");
             a = scanner.nextInt( );
             System.out.println ("Veuillez saisir un deuxieme nombre: \n");
             b = scanner.nextInt( );
             if ( b != 0 )
             {
               div = div + a / b;
             }
             
             System.out.println ("Le resultat est : "+ div);
             break;
        
            
             
           }
         } while ( choix != 3);       }
     }
