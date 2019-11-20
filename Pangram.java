import java.util.*;
import java.util.Map.*;
class Pangram{

public static void main(String[] args)
  {

String str = "The quick fox jumps over the lazy dog";
      String s = str.toLowerCase();
        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
      
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
            if(charCount.containsKey(s.charAt(i))){
                charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
            }
            else{
                charCount.put(s.charAt(i),1);
            }
            }
        }
      System.out.println(charCount);
      System.out.println(charCount.size());
      if(charCount.size()==26){
          System.out.println("The string is a pangram");
      }
      else{
          System.out.println("The string is not a pangram");
      }
  }
}
