import java.util.*;

class StringCheck5{

public static void main(String[] args)
  {

      String s ="The great Day was great Amazing";
      String[] myarr = s.toLowerCase().split(" ");
      System.out.println("original string in array"+Arrays.toString(myarr));
      ArrayList<String> arr = new ArrayList<String>();
      for(int i=0;i<myarr.length;i++){
          if(!arr.contains(myarr[i])){
              
              arr.add(myarr[i]);
          }
          
      }
      for(String str : arr){
          System.out.print(str+ " ");
      }
      System.out.println();
  }
  
}
