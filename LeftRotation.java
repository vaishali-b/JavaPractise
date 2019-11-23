

class LeftRotation{

public static void main(String[] args)
  {

      int[] arr = {1,2,3,4,5};
     
      int rot = 4;
     
      rot = rot % arr.length;
             for(int i=rot;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
             }
             for(int i=0;i<(rot);i++){
                 System.out.print(arr[i]+" ");
             }
      
      
  }
   
}
