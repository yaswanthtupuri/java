import java.util.*;
import java.io.*;
import java.lang.*;
public class Arrayrotation {
    public static void main(String args[])
    {
        // left rotation of an array
    int a[]={9,1,2,3,4,5,6,7,8};
    int temp=a[0];
    for(int i=1;i<a.length;i++)
    {
        a[i-1]=a[i];
    }
    a[a.length-1]=temp;
    System.out.println("left rotation:");
     for(int i=0;i<a.length;i++)
    {
        System.out.print(+a[i]+" "); 
    }
    System.out.println("");
    // right rotation of an array
    int b[]={1,2,3,4,5,6,7,8,9}; 
    int temp1=b[b.length-1];
    for(int i=b.length-1;i>0;i--)
    {
        b[i]=b[i-1];
    }
    b[0]=temp1;
    System.out.println("right rotation:");
     for(int i=0;i<b.length;i++)
    {
        System.out.print(+b[i]+" "); 
    }

}
    
}
