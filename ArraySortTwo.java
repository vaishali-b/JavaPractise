import java.util.*;
class ArraySortTwo{

public static void main(String[] args)
  {
  //input: int A[]={0,2,5,8}, int[] B={1,6,7}
      //output: A={0,1,2,5}, B={6,7,8}
      
      int A[]={0,2,5,8};
      int B[]={1,6,7};
      int temp=0;
      int i=0;
      while(i<A.length){
          if(A[i]>B[0]){
              temp=A[i];
              A[i]=B[0];
              B[0]=temp;
          }
          i++;
      }
      Arrays.sort(B);
      System.out.println("A "+Arrays.toString(A));
      System.out.println("B "+Arrays.toString(B));
  
  }
  }
