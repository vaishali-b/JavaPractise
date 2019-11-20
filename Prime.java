import java.util.*;

class Prime{

public static void main(String[] args)
  {



      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number: ");
      int input=scan.nextInt();
      boolean prime =true;
      for (int i=2;i<=input/2;i++){
          if(input%i==0){
              prime=false;
              break;
          }
      }
      if(prime){
          System.out.println(input+" is Prime");
      }
      else{
          System.out.println(input+" is not Prime");
      }
      
  }
}

