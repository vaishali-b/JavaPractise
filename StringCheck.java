import java.util.*;
class StringCheck{

public static void main(String[] args)
  {
  
  
  //String s = "saabbs";
      String s1 = "saabs";
      Stack<Character> mystack = new Stack<>();
  
   
      System.out.println("stack "+mystack);
      for(int p=0;p<s1.length();p++){
          char c = s1.charAt(p);
         
          if(!mystack.empty()){
              //System.out.println("not empty"+c);
              if(c==mystack.peek()){
                  mystack.pop();
                  //System.out.println("popping when equal"+c);
              }
              else{
                  mystack.push(c);
                  //System.out.println("pushing when not equal"+c);
              }
          }
          else{
               mystack.push(c);
              //System.out.println("empty"+c);
          }
          
          
      }
       System.out.println("final stack "+mystack);

  }
  }
