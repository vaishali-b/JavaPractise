import java.util.*;

class Handshake{

public static void main(String[] args)
  {
  
  
     
      int handshakes=0;
      Scanner scan = new Scanner(System.in);
           System.out.println("Enter number of test cases: ");
           int input=scan.nextInt();
      int myarr[] = new int[input];
      for(int i=0;i<input;i++){
          int test = scan.nextInt();
          myarr[i] = test;
          
      }
      for(int j=0;j<input;j++){
      handshakes = (myarr[j] * (myarr[j] -1) )/2;
      System.out.println("No of handshakes: "+handshakes);
  }
  
  
  /*
  int n=6;int handshakes=0;
  if(n==0 || n==1) handshakes=0;
  else if(n==2) handshakes=1;
  else handshakes=(n*(n-1))/2;
  
  */
  }
   
}
