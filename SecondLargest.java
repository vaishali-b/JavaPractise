
import java.util.*;

class SecondLargest 
{ 
   // second smallest number in Arrays
    public static void main(String args[]) 
    { 



 int[] myarr = {63,45,12,91,91,39}; // {63,45,12,27,91,39};
        int temp=0;
        for(int i=0;i<myarr.length;i++){
            for(int j=i+1;j<myarr.length;j++){
                if(myarr[i]>myarr[j]){
                    temp=myarr[j];
                    myarr[j]=myarr[i];
                    myarr[i]=temp;
                }
            }
        }
        int max=myarr[myarr.length-1];
        int secmax=0;
        for(int h=0;h<myarr.length;h++){
            if(myarr[h]>secmax && myarr[h]<max){
                secmax=myarr[h];
                
            }
            if(max==secmax){
                secmax=myarr[myarr.length-2];
            }
           
        }
        
        System.out.println(Arrays.toString(myarr));
        System.out.println("Largest"+max);
        System.out.println("Second largest"+secmax);
    }
} 
