import java.io.*;
import java.util.*;
import java.lang.*;
public class Secondlargestodd
{
    public static void main(String args[])
    {
    int a[]={2,5,4,1,3,9,7,6,8};
    Arrays.sort(a);
    int max1,max2;
    max1=max2=a[0];
     for(int i=0;i<a.length;i++)
     {
        System.out.println(a[i]);
     }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]%2!=0)
        {
        if(a[i] > max1)
        {
            max2=max1;
            max1=a[i];
        }
    }
        
    }
    System.out.println("Second largest odd number:"+max2);
    

    }
}