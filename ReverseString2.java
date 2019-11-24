

import java.util.*;

class ReverseString2{

public static void main(String[] args)
  {

  Scanner scan = new Scanner(System.in);
      System.out.println("Enter string: ");
     
      String s =scan.next();
      ArrayList<Character> charArray = new ArrayList<Character>();
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)>='A' &&  s.charAt(i)<='z'){
              charArray.add(s.charAt(i));
          }
          
          }
      System.out.println("temp alphabets array"+charArray);
      
      StringBuilder str = new StringBuilder(s);
  
      int j=charArray.size()-1;
 
          for(int h=0;h<str.length();h++){
            
              if(Character.isLetter(str.charAt(h))){
                  str.setCharAt(h,charArray.get(j));
                  
                  j=j-1;
              }
              
          }
     
      System.out.println("ReversedString: "+str);
}

}
