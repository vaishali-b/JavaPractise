import java.util.*;
class BubbleSort{

public static void main(String[] args)
  {
   //Bubble Sort
      int[] arr = {64,31,3,27,48,19};
      int temp=0;
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              if(arr[j]>arr[i]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      System.out.println(Arrays.toString(arr));
      
      
  }
}
