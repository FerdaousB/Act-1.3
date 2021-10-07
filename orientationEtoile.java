import java.util.Scanner;


public class orientationEtoile {
 
   static void tri_prenoms(String[] prenoms)
   {  
        int N = prenoms.length;  
        String p;  
        for(int i=0; i < N ; i++) 
        {
                for(int j=1; j < (N -i); j++)
                {  
                        if(prenoms[j-1].compareTo(prenoms[j]) > 0)
                        {
                               
                                p = prenoms[j-1];  
                                prenoms[j-1] = prenoms[j];  
                                prenoms[j] = p;  
                        }
 
                }
        }
   }
   static void displayTab(String[] prenoms)
   {    
        for(int i=0; i < prenoms.length; i++)
        {
                System.out.print(prenoms[i] + " ");  
        }
        System.out.println();
   }
static void displayetoile(String etoile)
   {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le noms que vous souhaitez saisir : ");
        etoile = scanner.nextInt();
    
   }
  
   public static void main(String[] args)
   {
        String[] prenoms = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
 
        System.out.println("Tableau non trie"); 
    
        displayTab(prenoms);
        
        tri_prenoms(prenoms);
 
        System.out.println("Tableau triee");  
    
        displayTab(prenoms); 

       displayetoile(etoile);
    
   }
}