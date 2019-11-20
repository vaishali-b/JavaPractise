class PairForSum{

public static void main(String[] args)
  {
  
      
     // Input -  Parameter 1:  Int[] array = {1,2,3,4,5} , Parameter 2: 7
     // Output – 2       (2 pairs : 2,5  ; 3,4)
      int[] arr1 = {1,2,3,4,5};
      int sum = 6;
      int output=0;
      for(int q=0;q<arr1.length;q++){
          for(int w=q+1;w<arr1.length;w++){
              if((arr1[q]+arr1[w])==sum){
                  output+=1;
                  System.out.println("pairs "+arr1[q]+","+arr1[w]);
              }
              
          }
      }
      }
      }
