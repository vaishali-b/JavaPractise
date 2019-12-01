import java.util.*;
class MyArrays{
   
public static void main(String[] args){



 System.out.println("Common elements in two arrays");
    int[] a= {1,3,5,7,9};
    int[] b= {5,4,3,8,6};
    for(int i=0;i<a.length;i++){
     for(int j=0;j<a.length;j++){
         if(a[i]==b[j]){
             System.out.println("Common element: "+a[i]);
         }
     }
    }
   

System.out.println("======================================");
System.out.println("Remove Duplicate elements from array");

int[] arr1={1,45,23,1,76,23,51,83};
ArrayList<Integer> temp =new ArrayList<Integer>();
for(int index=0;index<arr1.length;index++){
if(!temp.contains(arr1[index])){
    temp.add(arr1[index]);
}
}
System.out.println("Array after removing duplicate elements "+temp);
    
    System.out.println("====================================");
    System.out.println("Second Max and Min element in array");
    int[] arr= {2,4,1,5,32,46,12};
    int t=0;
    for(int k=0;k<arr.length;k++){
        for(int l=k+1;l<arr.length;l++){
            if(arr[k]>arr[l]){
                t=arr[k];
                arr[k]=arr[l];
                arr[l]=t;
            }
            }
        }
    System.out.println("Sorted Array :"+Arrays.toString(arr));
    int max=arr[arr.length-1];
    int min=arr[0];
    int secondMax=Integer.MIN_VALUE;
    int secondMin=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>secondMax && arr[i]!=max){
            secondMax=arr[i];
        }
        if(arr[i]<secondMin && arr[i]!=min){
            secondMin=arr[i];
        }
        }
    
    System.out.println("Second Max: "+secondMax);
    System.out.println("Second Min: "+secondMin);
    
    System.out.println("====================================");
    System.out.println("Add two matrices of same size");
    int[][] q={{1,1},{2,2}};
    int[][] p={{2,1},{3,4}};
    int[][] finalArr = new int[q.length][p.length];
    
    for(int k=0;k<q.length;k++){
    for(int l=0;l<p.length;l++){
        finalArr[k][l]=q[k][l]+p[k][l];
    }
        
    }
    
    
    for(int k=0;k<q.length;k++){
       for(int l=0;l<p.length;l++){
           System.out.print(finalArr[k][l]+" ");
           
       }
          System.out.println();
       }
       
  System.out.println("====================================");
     System.out.println("Arraylist to array and vice versa");
    
    int[] a1={1,4,6,2,7,8,21};
    
    ArrayList<Integer> a2=new ArrayList<Integer>();
    for(int i=0;i<a1.length;i++){
        a2.add(a1[i]);
    }
    System.out.println("ArrayList:"+a2);
  //  System.out.println(a2.contains(2));
    int[] a3=new int[a2.size()];
    for(int g=0;g<a2.size();g++){
        a3[g]=a2.get(g);
        
    }
    
    System.out.println("Array:"+Arrays.toString(a3));
    
    
     System.out.println("====================================");
    
    System.out.println("Pairs whose sum equal to given number");
    int[] arr3={1,2,3,4,5,6};
    int n=8;
    
     for(int i=0;i<arr3.length;i++){
          for(int j=i+1;j<arr3.length;j++){
              if(arr3[i]+arr3[j]==n){
              System.out.println("Pairs whose sum equal to given number "+n+" are "+arr3[i]+","+arr3[j]);
              }
              }
          }
 System.out.println("====================================");
    
     System.out.println("Program to test equality of two arrays");
    int[] b1={1,3,5,7};
    int[] b2={1,3,9,7};
    boolean flag=true;
     for(int i=0;i<b1.length;i++){
         if(b1[i]!=b2[i]){
             flag=false;
         }
     }
    System.out.println(flag?"Equal":"Not Equal");
    
     System.out.println("====================================");
    
     System.out.println("Find missing number in an array");
    int[] c1={1,2,4,5,6,7};
    
    int start =c1[0];
    int end=c1[c1.length-1];
    for(int i=0;i<c1.length;i++){
        
        if(c1[i]!=start){
            System.out.println("Missing Num: "+start);
            start+=1;
    }
        start+=1;
    }
     System.out.println("====================================");
    System.out.println("Find common elements from 3 sorted arrays");
   
   int array1[] = {2, 4, 8};
    int array2[] = {2, 3, 4, 8, 10, 16};
    int array3[] = {4, 8, 14, 40};
     int x = 0, y = 0, z = 0;
     while (x < array1.length && y < array2.length && z < array3.length){
         if (array1[x] == array2[y] && array2[y] == array3[z]){
             System.out.println("Common: "+array1[x]);
             x++;
             y++;
             z++;
         }
         else if (array1[x] < array2[y])
             x++;
         else if (array2[y] < array3[z])
             y++;
         else
             z++;
     }
    
  System.out.println("====================================");
     System.out.println("Move zeroes to one end");
    int[] d1={1,2,0,4,6,0,8};
 
    int tem=0;
    int x1=0;
    for(int i=0;i<d1.length;i++){
        if(d1[i]==0){

            for (int j=i;j>x1;j--){
                tem=d1[j-1];
                d1[j-1]=d1[j];
                d1[j]=tem;
               // System.out.println("here"+Arrays.toString(d1));
            }
            x1+=1;
        }
      // System.out.println("arr"+Arrays.toString(d1));
    }
    System.out.println("array"+Arrays.toString(d1));
    System.out.println("====================================");
    
    System.out.println("find even and odd integers in array");
    
    int[] myArray={0,1,43,25,12,73,88,91};
    int even=0;
    int odd=0;
    for(int i=0;i<myArray.length;i++){
        if(myArray[i]%2==0) even+=1;
        else odd+=1;
        
        
        
    }
    System.out.println("even: "+even+" odd: "+odd);
      System.out.println("====================================");
      System.out.println("difference between largest and smallest number");
    int[] myArray1={63,22,11,46,57,35};
    int maxi=Integer.MIN_VALUE;
    int mini=Integer.MAX_VALUE;
    int sum1=0;
    for(int i=0;i<myArray1.length;i++){
        if(myArray1[i]>maxi){
            maxi=myArray1[i];
        }
        if(myArray1[i]<mini){
            mini=myArray1[i];
        }
        sum1+=myArray1[i];
    }
      System.out.println("max: "+maxi+" min: "+mini);
      System.out.println("difference: "+(maxi-mini));
     
    sum1=sum1-maxi-mini;
    System.out.println("avg without max and min elements: "+(sum1/myArray1.length));
      System.out.println("====================================");
    System.out.println("rotate array clockwise direction");
    int[] myArray2 ={60,10,20,30,40,50};
    int temp1=myArray2[myArray2.length-1];
    for(int i=myArray2.length-1;i>0;i--){
        myArray2[i]=myArray2[i-1];
        
    }
    myArray2[0]=temp1;
    System.out.println("rotated array: "+Arrays.toString(myArray2));
    System.out.println("====================================");
    
    System.out.println("Arrange negative number on one side");
    
    int[] myArray3 ={9,-3,6,45,-2,62,-7,36};
    int x2=0;
    int temp2=0;
    for(int i=0;i<myArray3.length;i++){
        if(myArray3[i]<0){
            for(int j=i;j>x2;j--){
                temp2=myArray3[j-1];
                myArray3[j-1]=myArray3[j];
                myArray3[j]=temp2;
            }
            x2+=1;
        }
        
    }
    System.out.println(Arrays.toString(myArray3));
     System.out.println("====================================");
     System.out.println("print max min second max second min");
    int[] myArray4={1,2,3,4,5,6};
    int[] myArray5=new int[myArray4.length];
    boolean flag1=true;
    int start1=0;
    int finish=myArray4.length-1;
    for(int i=0;i<myArray4.length;i++){
        if(flag1){
            myArray5[i]=myArray4[finish--];
            
        }
        else{
            myArray5[i]=myArray4[start1++];
           
        }
        flag1=!flag1;
       
    }
     System.out.println(Arrays.toString(myArray5));
}
}
