import java.util.Scanner;
public class palindrome
{

    public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
           
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
           
            return isPal(s.substring(1, s.length()-1));
        
           return false;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le mot que vous souhaitez");
        String x = sc.nextLine();
        if(isPal(x))
            System.out.println(x + " est palindrome");
        else
            System.out.println(x + " est non palindrome");
    }
}
