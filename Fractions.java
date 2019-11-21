import java.util.*;
class Fractions{
public static void addFractions(int[] fraction1,int[] fraction2){
        //find lcm of denominator
        int sum=1;
        int lcm=1;
        int multipleF1=1;
        int multipleF2=1;
        for(int i=1;i<fraction1[1];i++){
            if(((i*fraction1[1])%fraction2[1])==0){
                lcm=i*fraction1[1];
                multipleF1=i;
                multipleF2=lcm/fraction2[1];
               
                break;
            }
        }
        //numerator multiplication  
        int numerator=( fraction1[0]*multipleF1 + fraction2[0]*multipleF2);
        
        
        int gcm=gcm(numerator,lcm);
        int[] solution={numerator/gcm,lcm/gcm};
        System.out.println(Arrays.toString(solution));
        
    }
    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }

   




public static void main(String[] args){

      int[] fraction1=  {3,5};    //{3,9};
      int[] fraction2=  {9,15};    //{2,6};
      addFractions(fraction1,fraction2);
      
    }
    
}

