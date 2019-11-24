import java.util.*;

class TimeConversion{

public static void main(String[] args)
  {
  
      String s= "11:05:45PM";
      int hour = Integer.parseInt(s.substring(0, 2)) % 12;
      if (s.endsWith("PM")){
             hour += 12;
      }
      System.out.println(String.format("%02d", hour) + s.substring(2, 8));
}

}
