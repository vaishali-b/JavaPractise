import java.util.Arrays;
class ArraySort{

public static void main(String[] args)
  {
      //sort even and odd numbers in a array
      //int myarr[] = {3, 2, 7, 5, 9 };
      int myarr[] = { 3,5,6,8,1};
      for (int i = 0; i < myarr.length; i++){
        if ((myarr[i] & 1) != 0){
          myarr[i] *= -1;
        }
      }
               
      Arrays.sort(myarr);
      
      for (int i = 0; i < myarr.length; i++){
        if ((myarr[i] & 1) != 0){
          myarr[i] *= -1;
        }
      }
      System.out.println(Arrays.toString(myarr));
  
  
  // Sort in a way such that even first and odd last
  
  int temp=0,rot=0;
  for(int i=0;i<myarr.length;i++){
   if(myarr[i]%2==0){
    for(int j=i;j>rot;j++){
     temp=myarr[j-1];
      myarr[j-1]=myarr[j];
      myarr[j]=temp;
      
    }
     rot++;
   }
    
  }
  
  System.out.println(Arrays.toString(myarr));
       }
}
