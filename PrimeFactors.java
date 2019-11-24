
import java.util.*;

class PrimeFactors{

public static void main(String[] args)
  {

Scanner scan = new Scanner(System.in);
      System.out.println("Enter number ");
      int n=scan.nextInt();
      long primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
      int count = 0;
      long pf = primes[0];
      if(n==1){
               System.out.println(n);
           }
      else{
            for(int j = 1; j < primes.length && pf <= n && n != 1; j++){
                pf = pf * primes[j];
                count++;
                }
            System.out.println(count);
      }
   
}

}
