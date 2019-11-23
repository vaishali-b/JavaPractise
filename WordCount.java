import java.util.*;
import java.util.Map.*;
class WordCount{

public static void main(String[] args)
  {
  
   String[] input ={"love","hate","peace","love","hate","peace","love","peace","hapiness","love","peace","hapiness"};
      HashMap<String,Integer> hm = new HashMap<String,Integer>();
      for(int i=0;i<input.length;i++){
          if(hm.containsKey(input[i])){
                       hm.put(input[i],hm.get(input[i])+1);
                   }
                   else{
                       hm.put(input[i],1);
                   }
      }
      int count=0; 
      for (Entry<String, Integer> entry : hm.entrySet()) {
          if(entry.getValue()==2){
              
              count+=1;
              System.out.println(entry.getKey()+" repeats twice");
          }
      }
      System.out.println("count of words repeating twice "+count);
      
  }}

