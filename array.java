

import java.util.*;
public class array{
    public static void main(String args[])
    {
    int[] arrayname=new int[3];
    arrayname[0]=98;
    arrayname[1]=99;
    arrayname[2]=88;
    /*System.out.println(arrayname[0]);
    System.out.println(arrayname[1]);
    System.out.println(arrayname[2]);*/
    for(int i=0;i<3;i++)
    {
        if(i%2==0){
            System.out.println("number is even");
        }
    System.out.println(arrayname[i]);
    }
    }
    
}
