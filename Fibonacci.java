
class Fibonacci{

public static void main(String[] args)
  {
  
        int a = 0;
        int b = 1;
        int n = 10;
        int sum = 0;
         ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
          //System.out.println(a); --prints each element of series line by line
            arr.add(a);  
          sum = a + b;
            a = b;
            b = sum;
           //Series
        System.out.println("Fibonacci Series: "+arr);
        //Retreive nth element
        int input = 8;
        System.out.println(input+"th Element in series is "+arr.get(input-1));
        //sum till nth element
        int value = 13;
        int sumOfVal=0;
        for (int j=0;j<=arr.indexOf(value);j++){
            sumOfVal+=arr.get(j);
        }
        System.out.println("Sum of elements in series upto value "+value+" is "+sumOfVal);
        
        

  }
  }
