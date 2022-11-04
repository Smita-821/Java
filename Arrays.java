import java.util.Arrays;
//declaring array and printing the length of an array
public class Main
{
    public static void main(String[] args) {
     int a[]={244,322,201,500,688};
      System.out.println("length of an array is:" +a.length);
      for(int i=0;i<5;i++)//for loop
      {
          System.out.println(a[i]);
     }
     System.out.println("using for each loop");
     for (int i:a)
     {
         System.out.println(i);
     }
     System.out.println("multidimensional array");
      int b[][]={{100,200},{300,400},{500,600}};
      System.out.println("no of rows" + b.length);
      System.out.println("no of columns" + b[0].length);
     for (int i=0;i<b.length;i++)
     {
         for(int j=0;j<b[i].length;j++)
         {
            System.out.println(b[i][j]); 
         }
     }
     System.out.println("foreach loop for multidimensional array");
     {
         for(int m[]:b){
             for (int i:m){
                 System.out.println(i);
             }
         }
     }
     
     
      
      
                   
                 
       
    }
}
