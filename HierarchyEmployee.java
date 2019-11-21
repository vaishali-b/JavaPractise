import java.util.*;
import java.util.Map.*;
class HierarchyEmployee{

public static void main(String[] args)
  {


      //1: 2,3,4
      //  3: 5,6,7
      //6: 8, 9, 10
      Map<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
      List<Integer> values1 = new ArrayList<Integer>();
      List<Integer> values2 = new ArrayList<Integer>();
      List<Integer> values3 = new ArrayList<Integer>();
      values1.add(2);
      values1.add(3);
      values1.add(4);
      hm.put(1, values1);
      values2.add(5);
      values2.add(6);
      values2.add(7);
      hm.put(3, values2);
      values3.add(8);
      values3.add(9);
      values3.add(10);
      hm.put(6, values3);
      
      
      System.out.println(hm);
      int input =4;
      boolean isKey=false;
      List<Integer> temp = new ArrayList<Integer>();
      List<Integer> temp2 = new ArrayList<Integer>();
      if(hm.containsKey(input)){
          isKey=true;
          System.out.println(input+" has "+hm.get(input)+" direct reports");
          temp=hm.get(input);
          for(int i=0;i<temp.size();i++){
              if(hm.containsKey(temp.get(i))){
                  System.out.println(input+" has "+hm.get(temp.get(i))+" indirect reports");
                  temp2=hm.get(temp.get(i));
                  
                  for(int j=0;j<temp2.size();j++){
                  if(hm.containsKey(temp2.get(j))){
                      System.out.println(input+" has "+hm.get(temp2.get(j))+" indirect reports");
                  }
                  }
                  
              }
          }
      }
      else{
          System.out.println(input+" has no direct reports");
      }
     
  }
}

