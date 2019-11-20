class Swap{

public static void main(String[] args)
  {

      //Swap Numbers without using third variable
      int a = 45;
      int b = 99;
      System.out.println("Input: "+a+","+b);
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("Swapped: "+a+","+b);
      
  }
}

