import java.util.*;
import java.io.*;
import java.lang.*;
public class vowels
{
    public static void main(String args[])
    {
        String str1="HELLO Worldo";
        String str=str1.toUpperCase();
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
        
        if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' )
        {
            count++;
        } 
    }
        System.out.println(count);
    
    }
}