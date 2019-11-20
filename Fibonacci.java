
class Fibonacci{

public static void main(String[] args)
  {
  System.out.println("Fibonacci series");
        int a = 0;
        int b = 1;
        int n = 10;
        int sum = 0;
        
        for(int i=1;i<=n;i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(a);

  }
  }
