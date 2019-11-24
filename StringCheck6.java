
import java.util.*;

class StringCheck6{

public static void main(String[] args)
  {



 Scanner scan = new Scanner(System.in);
      System.out.println("Enter string :");
      String s =scan.next();
      System.out.println("Enter substring limit: ");
      int k= scan.nextInt();
      String smallest = s.substring(0, k);
         String largest = s.substring(0, k);
         String temp;
         for(int i = 0 ; i < s.length() - k + 1 ; i++)
         {
             temp = s.substring(i, i + k);
             if(smallest.compareTo(temp) > 0) smallest = temp;
             if(largest.compareTo(temp) < 0) largest = temp;
         }
      System.out.println( smallest + "\n" + largest);
  }
    
    
