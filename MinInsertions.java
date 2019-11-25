import java.util.*;

class MinInsertions{

public static void main(String[] args)
  {



  String str= "aaceaaaa";
      System.out.println(findMinInsertions(str.toCharArray(),
                                        0, str.length()-1));
  }
      
      static int findMinInsertions(char str[], int l,
                                                  int h)
         {
          
             if (l > h) return Integer.MAX_VALUE;
             if (l == h) return 0;
             if (l == h - 1) return (str[l] == str[h])? 0 : 1;
       
            
             return (str[l] == str[h])?
                 findMinInsertions(str, l + 1, h - 1):
                 (Integer.min(findMinInsertions(str, l, h - 1),
                 findMinInsertions(str, l + 1, h)) + 1);
         }
       
}
