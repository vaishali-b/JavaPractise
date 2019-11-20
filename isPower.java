
class isPower{

public static void main(String[] args)
  {
int n=500;
    
      int m=10;
      int pow=1;
      while(pow<n){
          pow=pow*m;
          if(pow==n){
              System.out.println(n+" is a power of "+m);
              break;
          }
          
          
      }
      if(pow!=n){
          System.out.println(n+" is not a Power of "+m);
      }
      }
      }
