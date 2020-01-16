class MinCompare{

public static void main(String[] args){
  int a = 10;
  int b = 7;
  int c= 50;
  
  int x = a-b, y = b-c, z = c-a;
  int mid = 0;
  
  if(x*y > 0) mid = b;
  else if(x*z > 0) mid = c;
  else mid = a;
  
  System.out.println("Middle value with minimum comparisons: "+mid);


}

}
