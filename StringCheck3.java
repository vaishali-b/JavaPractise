
import java.util.*;
import java.util.Map.*;
class StringCheck3{

public static void main(String[] args)
  {


      String s="aabbbbdrr";
      
      HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
      
      for (int i=0;i<s.length();i++){
          if(charCount.containsKey(s.charAt(i))){
              charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
          }
          else{
              charCount.put(s.charAt(i),1);
          }
          
      }
      char c='a';
      for (Entry<Character, Integer> entry : charCount.entrySet()) {
          if(entry.getValue()==1){
              c=entry.getKey();
              break;
          }
      }
      System.out.println("First non repeating character "+c+" is at index "+s.indexOf(c));
  }
}

