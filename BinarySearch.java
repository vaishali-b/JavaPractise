import java.util.*;

class BinarySearch{

public static void main(String[] args)
  {


//Binary Search
      
      int[] arr= {11,24,36,48,51,64,72,81,96};
      
      int n=36;
      int findex=0;
      int lindex=arr.length-1;
      while(findex<=lindex){
          int mindex= (findex+lindex)/2;
          if(n==arr[mindex]){
              System.out.println(n+" is found at index "+mindex);
              break;
          }
          if(n<arr[mindex]){
              lindex=mindex-1;
          }
          else{
              findex=mindex+1;
          }
      }
      
      
  }
}

