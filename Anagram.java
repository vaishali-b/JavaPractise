import java.util.*;

class Anagram{

public static void main(String[] args){

      String str1= "cinema";
      String str2 ="Iceman";
      int count =0;
      if(str1.length()!=str2.length()){
           System.out.println("Not anagrams");
          return;
      }
      String s1 = str1.toLowerCase();
      String s2 = str2.toLowerCase();
      
      for(int i=0;i<s1.length();i++){
          String temp = String.valueOf(s1.charAt(i));
          if(s2.contains(temp)){
              count+=1;
          }
      }
      if(count==s1.length()&& count==s2.length()){
          System.out.println("Anagrams");
          
      }
      else{
          System.out.println("Not anagrams");
      }
  }
 }

