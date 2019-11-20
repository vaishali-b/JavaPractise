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
      }
}
