import java.util.*;
import java.util.Map.*;
class Practise{

public static void main(String[] args)
  {
   //Input – Parameter: aabbbbbcAAA
     // Output - <2, 5>  ( ‘b’ startIndex of is 2 and count is 5)
  String s = "aabbbbbc";
      HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
      int count=0;
      for (int i=0;i<s.length();i++){
          if(charCount.containsKey(s.charAt(i))){
              charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
          }
          else{
              charCount.put(s.charAt(i),1);
          }
          
      }
      int max=(Collections.max(charCount.values()));
      int index=0;
      char c='a';
      for (Entry<Character, Integer> entry : charCount.entrySet()) {
          if(entry.getValue()==max){
              c=entry.getKey();
              break;
          }
      }
      for(int j=0;j<s.length();j++){
          if(s.charAt(j)==c){
              index=j;
              break;
          }
      }
      System.out.println(charCount);
      System.out.println("Character "+c+" @ index "+index+" repeated for "+max+" times" );
      System.out.println(index+","+max);
      
      
      
  }
}
