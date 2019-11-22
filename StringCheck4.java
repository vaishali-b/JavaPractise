import java.util.*;
import java.util.Map.*;
class StringCheck4 
{ 
    /*  For a string input the function returns output encoded as follows:
                Input "" Output ""
                Input a Output a1
                Input aa Output a2
                Input aabb Output a2b2
                Input aaabb Output a3b2 */
                
    public static void main(String args[]) 
    { 


        String s,solution="";
       
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        s = in.nextLine();
      
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
       for (Entry<Character, Integer> entry : charCount.entrySet()) {
            
           solution=solution+entry.getKey()+entry.getValue().toString();
              
        }
        
        System.out.println(solution);
    } 
} 
