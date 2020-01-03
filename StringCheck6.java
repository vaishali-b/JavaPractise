
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
         String largest = "";
         String temp;
         for(int i = 0 ; i < s.length() - k + 1 ; i++) // .  for(int i = 0 ; i <= s.length() - k ; i++)
         {
             temp = s.substring(i, i + k);
             if(temp.compareTo(smallest) < 0) smallest = temp;
             if(temp.compareTo(largest) > 0) largest = temp;
         }
  
  /*
  String s4="welcometojava";
  int k=3;
  SortedSet<String> ss=new TreeSet<>();
  for(int i=0;i<=s4.length()-k;i++){
  ss.add()s4.substring(i,i+k);
  }
  System.out.println(ss.first()+ "\n"+ ss.last());
  */
      System.out.println( smallest + "\n" + largest);
  }
    
    
