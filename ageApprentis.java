public class ageApprentis{

     public static void triAge(int[] ageArray)
     {
          for (int i = 0; i < ageArray.length - 1; i++)  
          {
               int max = i;  
               for (int j = i + 1; j < ageArray.length; j++)
               {
                    if (ageArray[j] > ageArray[max]){ 
                         max = j;
                    }
               }
 
               int p  = ageArray[max ];
               ageArray[max ] = ageArray[i]; 
               ageArray[i] = p;
          }
     }

     static void displayTab(int[] ageArray){
          for(int i=0; i < ageArray.length; i++)
          {  
               System.out.print(ageArray[i] + " ");  
          } 
          System.out.println();    
     }
  
     public static void main(String a[])
     {  
        
          int[] ageArray = {45, 54, 23, 32, 64, 46, 28, 82};
  
          System.out.println("**** Avant le tri par selection *****");
          displayTab(ageArray);

          //tri d un tableau avec l algorithme de tri par selection
          triAge(ageArray);
 
          System.out.println("**** Apres le tri par selection ****");  
          displayTab(ageArray); 
     } 
}
