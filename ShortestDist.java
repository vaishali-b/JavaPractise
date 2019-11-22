import java.util.*;

class ShortestDist{ 
{ 
   /*Find shortest distance between the two words in a very long string. For that consider the median of words as the start and end position and determine the distance.
             Median of word 'words' falls on 'r'*/
   
    static int distance(String s,String word1,String word2)
    {
           
        if (word1 .equals( word2) )
            return 0 ;
       
        String words[] = s.split(" ");
        int min_dist = (words.length) + 1;
        for (int index = 0;
             index < words.length ; index ++)
        {
       
            if (words[index] .equals( word1))
            {
                for (int search = 0;
                     search < words.length; search ++)
                {
                    if (words[search] .equals(word2))
                    {
                       
                        int curr = Math.abs(index - search) - 1;
       
                       
                        if (curr < min_dist)
                        {
                            min_dist = curr ;
                        }
                    }
                }
            }
        }
           
       
        return min_dist;
    }
    public static void main(String args[]) 
    { 


 String s = "the quick brown fox jumps over the lazy frog";
        String word1 = "fox" ;
        String word2 = "frog" ;
           
        System.out.println( distance(s, word1, word2) );
        
    }
   
       
} 
