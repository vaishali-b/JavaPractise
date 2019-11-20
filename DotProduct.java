class DotProduct{

public static void main(String[] args)
  {

      int[] a={1,2,3,4,5,6,7};
      int[] b={7,6,5,4,3,2,1};
      
      int sum=0;
      for(int i=0;i<a.length;i++){
          sum=sum + (a[i]*b[i]);
          
      }
      System.out.println("Dot Product: "+sum);
      
  }
}
