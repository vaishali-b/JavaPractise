import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    String orig, rev = “";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string");
    orig = in.nextLine();
    int length = orig.length();
    for (int i = length - 1; i >= 0; i--)
      rev = rev + orig.charAt(i);
    if (orig.equals(rev))
      System.out.println("The string is a palindrome.");
    else
      System.out.println("The string is not a palindrome.");
  }
}
