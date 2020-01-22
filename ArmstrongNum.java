
import java.util.*;

class ArmstrongNum{

public static void main(String[] args)
  {
      //Armstrong number   
      int input=405;
    /*  String temp=Integer.toString(input);
      int[] myarr = new int[temp.length()];
      int sum=0;
      for(int i=0;i<temp.length();i++){
          myarr[i]=temp.charAt(i)-'0';
      }
      System.out.println(Arrays.toString(myarr));
      for (int j=0;j<myarr.length;j++){
          sum=sum +(myarr[j]*myarr[j]*myarr[j]);     
      }
      if(sum==input){
          System.out.println(input+" is an Armstrong Number");    
      }
      else{
          System.out.println(input+" is not an Armstrong Number");
      }*/
    String[] s=String.valueOf(n).split("");
    int sum=0;
    for(int i=0;i<s.length;i++){
     sum += Math.pow(Integer.parseInt(s[i]),s.length); 
    }
  System.out.println((sum==input)?"Armstrong Number":"Not Armstrong Number");
  }
}
