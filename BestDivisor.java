import java.util.*;

class BestDivisor{

public static void main(String[] args)
  {


Scanner scan = new Scanner(System.in);
      System.out.println("Enter number: ");
      int input = scan.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=1;i<=input;i++){
          if(input%i==0){
              arr.add(i);
          }
      }
      System.out.println(arr);
      
      
       int max=0;
      int finalN=0;
      for(int j : arr){
          int sum =0;
          int val =j;
          while(val!=0){
              sum+=val%10;
              val=val/10;
          }
          if(sum>max){
              max=sum;
              finalN=j;
          }
      }
      System.out.println(finalN);
}

}
