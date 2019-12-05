import java.util.regex.*;
import java.util.*;
import java.util.Map.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File; 
import java.io.FileNotFoundException;
class MyString{
 
public static void main(String[] args){
    
    System.out.println("Print Duplicate characters in string");
    String s1="asdfacvshAB####CABCDBCRA.af.y.f??t";
    
    int[] a1=new int[256];
    for(int i=0;i<s1.length();i++){
        a1[s1.charAt(i)]++;
        
    }
    for (int i = 0; i < 256; i++){
        if(a1[i] > 1)
            System.out.printf("%c,  count = %d \n", i,  a1[i]);
       
    }
    System.out.println("=================================");
    System.out.println("Check if strings are Anagrams");
    String s2="anagramms";
    String s3="mmarganas";
    if (s2.length() != s3.length()) {
        System.out.println("not Anagrams");
        return;
    }
        
        s2 = s2.toLowerCase();
        s3 = s3.toLowerCase();
        
        int [] temp = new int [Character.MAX_VALUE];
  
        
        int summ = 0;

        for (int i = 0; i < s2.length(); i++){
            summ += ++temp [s2.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [s3.charAt(i)] >= 0 ? -1 : 1;
        }
   

    System.out.println((summ==0)?"Anagrams":"Not Anagrams");
    System.out.println("=================================");
    System.out.println("Count the no of words in a string");
    
    
    String s4="the quick brown frog;jumps;over the lazy fox";
    String[] a2= s4.split("[ ;]");
  
    
    System.out.println(a2.length);
    
    System.out.println("=================================");
       System.out.println("Program to reverse a string");
    
    String s5="palindrome";
    for(int i=s5.length()-1;i>=0;i--){
        System.out.print(s5.charAt(i));
    }
    System.out.println();
    
    
    System.out.println("=================================");
    System.out.println("Program to reverse a string using recursion");
    
    
   /* int n=s5.length()-1;
    while(n>=0){
        System.out.print(s5.charAt(n));
        n--;
    }*/
    reverse("today is a sunny day");
    
    System.out.println();
    System.out.println("=================================");
       System.out.println("Remove whitespaces in a string");
    
    
    System.out.println(s4.replace(" ",""));
    for(int i=0;i<s4.length();i++){
        if(!Character.isWhitespace(s4.charAt(i))) System.out.print(s4.charAt(i));
    }
    System.out.println();
     System.out.println("=================================");
     System.out.println("First non repeating and repeating character in string");
    char[] charCount=new char[256];
    for(int i=0;i<s4.length();i++){
        charCount[s4.charAt(i)]++;
        
    }
    
    for(int j=0;j<s4.length();j++){
        if(charCount[s4.charAt(j)]==1){
            System.out.println("first non repeating character "+s4.charAt(j)+ " at index "+j);
            break;
    }
        
    }
    for(int j=0;j<s4.length();j++){
           if(charCount[s4.charAt(j)]>=1){
               System.out.println("first  repeating character "+s4.charAt(j)+ " at index "+j);
               break;
       }
           
       }
    System.out.println("=================================");
    System.out.println("Check if string is only digits");
    String s6="12a324";
    if(s6.matches("[0-9]+")){
        System.out.println("String has only digits");
    }
    else{
        System.out.println("String does not have only digits");
    }
 /*   int cnt=0;
    for(int i=0;i<s6.length();i++){
        if(s6.charAt(i)>=0&&s6.charAt(i)<=9){
            cnt+=1;
        }
    }
    System.out.println((cnt==s6.length())?"Digits":"Not digits");*/
     System.out.println("=================================");
   
         ArrayList<Character> charArray = new ArrayList<Character>();
         for(int i=0;i<s4.length();i++){
             if(s4.charAt(i)>='A' &&  s4.charAt(i)<='z'){
                 charArray.add(s4.charAt(i));
             }
             
             }
      
         
         StringBuilder str = new StringBuilder(s4);
     
         int j=charArray.size()-1;
    
             for(int h=0;h<str.length();h++){
               
                 if(Character.isLetter(str.charAt(h))){
                     str.setCharAt(h,charArray.get(j));
                     
                     j=j-1;
                 }
                 
             }
        
         System.out.println("ReversedString: "+str);
    System.out.println("=================================");
    System.out.println("Count vowels and consonants");
    String s7="aeiou zxcvbnm ; ;,.";//s4.toLowerCase();
    int vowels=0;int consonants=0;int spl=0;
    for(int i=0;i<s7.length();i++){
        char ch= s7.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowels++;
        else if(ch>='a'&&ch<='z') consonants++;
        else spl++;
        
    }
    System.out.println("Vowels: "+vowels);
    System.out.println("Consonants: "+consonants);
    System.out.println("Special Characters: "+spl);
    System.out.println("=================================");
    
    System.out.println("String to Int and vice versa");
    int a=6;
    String s8="55";
    System.out.println("int to string"+String.valueOf(a)+5);
    System.out.println("String to int"+(7+Integer.parseInt(s8)));
    System.out.println("=================================");
    System.out.println("permutations of string");
    printPermutn("abc","");
    System.out.println("=================================");
       System.out.println("remove duplicate characters from string");
    
    String s9="abbccdeeff";
    ArrayList<Character> myArr1=new ArrayList<Character>();
    for(int i=0;i<s9.length();i++){
        if(!myArr1.contains(s9.charAt(i))){
            myArr1.add(s9.charAt(i));
        }
    }
    for(char c:myArr1){
        System.out.print(c);
    }
    
    System.out.println("=================================");
  System.out.println("append string to file");
    
    
    
    try(
        FileWriter fw = new FileWriter("myfile.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw))
    {
        out.println("the text");
        
        out.println("more text");
        
    } catch (IOException e) {
        System.out.println(e);
    }
    System.out.println("=================================");
       
    System.out.println("if string contains another string");
    System.out.println(s9.contains("eef")?"has string":"does not have string");
    
    System.out.println("=================================");
    System.out.println("check max repeated string in file");
 
    Scanner s =null;
    Scanner scan2=null;
    try{
        File f= new File("myfile.txt");
        File f1= new File("myfile2.txt");
          s= new Scanner(f);
    HashMap<String,Integer> hm = new HashMap<String,Integer>();
    while (s.hasNext()){
        String t=s.next();
        if(hm.containsKey(t)){
       hm.put(t,hm.get(t)+1);
            
        }
        else{
            
             hm.put(t,1);
        }
    }
        System.out.println(hm);
        int max=(Collections.max(hm.values()));
        for (Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue()==max){
                System.out.println("Max repeated string in file for "+max+" times is "+entry.getKey());
                break;
            }
        }
        int words = 0;
        int lines = 0;
        int chars = 0;
        scan2= new Scanner(f1);
        while(scan2.hasNextLine())  {
            lines++;
            
            String line = scan2.nextLine();
            
         for(int i=0;i<line.length();i++)
            {
                if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
                chars ++;
            }
            
            words += new StringTokenizer(line, " ").countTokens();
        }
        
        System.out.println("words"+words);
       System.out.println("characters"+chars);
        System.out.println("lines"+lines);
    }
    catch(FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    finally{
      s.close();
        scan2.close();
    }
    
    
    
    
}
    static void printPermutn(String str, String ans)
      {
    
          
          if (str.length() == 0) {
              System.out.print(ans + " ");
              return;
          }
    
          for (int i = 0; i < str.length(); i++) {
    
             
              char ch = str.charAt(i);
    
              
              String ros = str.substring(0, i) +
                           str.substring(i + 1);
    
              
              printPermutn(ros, ans + ch);
          }
      }
    static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            
            reverse(str.substring(0,str.length()-1));
        }
    }
}
