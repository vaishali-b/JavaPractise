import java.util.*;
class ReverseString 
{ 
    /*
    
    Write a program to reverse words in a string?
      input : saabbs
       output :sbbaas
    */
    public static void main(String args[]) 
    { 
    
            String orig, rev = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string");
            orig = in.nextLine();
            int length = orig.length();
            for (int i = length - 1; i >= 0; i--){
              rev = rev + orig.charAt(i);
            }
            System.out.println("The reversed string is "+rev);
           
       
    } 
} 
