import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class PractiseAll{

    public static void main(String[] args){
        //Robot Position
        String move="UUU";
        System.out.println("Robot final position:"+Arrays.toString(finalPosition(move)));
        int[] array1={67,34,22,14,88,45};
        System.out.println("Second Smallest Number: "+secondMini(array1));
        String[] strArray = {"the","quick","brown","fox","quick"};
        String str1 = "the";
        String str2 = "fox";
        System.out.println("Median of Words: "+findMinimumWordDistance(strArray,str1,str2));
        System.out.println("Encoded Output:"+stringEncode("aaaabbc"));
        System.out.println("Reverse words in a string: "+reverse("saabbs"));
        System.out.println("IPAddress accessed max times:");
        validateIP("{10.0.1.45 -/de/inc/sample,10.0.1.45 -/ad/fac/first…/sjfhjsafb,10.3.54.123 -/d/ert/jkl/mnb,10.3.54.123 -dfsjf/sdgd}");
        
      
    }
    public static void validateIP(String str){
        String ptString="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
           Pattern p=Pattern.compile(ptString);
           Matcher m=p.matcher(str);
           HashMap<String,Integer> al=new HashMap<String,Integer>();
           while(m.find()){
               if(al.containsKey(m.group())) al.put(m.group(),al.get(m.group())+1);
               else al.put(m.group(),1);
           }
        int max=Collections.max(al.values());
        for(Entry<String,Integer> entry:al.entrySet()){
            if(entry.getValue()==max) System.out.print(entry.getKey()+" ");
        }
    }
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String stringEncode(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hm.containsKey(ch)) hm.put(ch,1);
            else hm.put(ch,hm.get(ch)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(Entry<Character,Integer> entry:hm.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static int[] finalPosition(String move){
        int cntUp=0,cntDown=0,cntRight=0,cntLeft=0;
        for(int i=0;i<move.length();i++){
            if(move.charAt(i)=='U') cntUp+=1;
            else if(move.charAt(i)=='D') cntDown+=1;
            else if(move.charAt(i)=='R') cntRight+=1;
            else if(move.charAt(i)=='L') cntLeft+=1;
        }
       
        return new int[]{cntRight-cntLeft,cntUp-cntDown};
    }
    public static int secondMini(int[] array1){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<array1.length;i++){
            if(array1[i]<min) {
                secondMin=min;
                min=array1[i];
            }
            else if(array1[i]>min && array1[i]<secondMin) secondMin=array1[i];
        }
        
        return secondMin;
    }
  
    public static int findMinimumWordDistance(String[] words,String wordA,String wordB) {
      int wordAIndex = 0;
      int wordBIndex = 0;
      int minDinstance = 0;
      
      for (int i = 0, length = words.length; i < length; i++ ) {
        if (words[i] == wordA) {
          wordAIndex = i;
        }
        
        if (words[i] == wordB) {
          wordBIndex = i;
        }

        if ( wordAIndex >= 0 && wordBIndex >= 0 ) {
          var distance = Math.abs(wordAIndex - wordBIndex);
          if(minDinstance == 0 || minDinstance > distance) {
            minDinstance = distance;
          }
        }
      }
      return minDinstance;
    }


}
