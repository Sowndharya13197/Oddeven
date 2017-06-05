import java.io.*;
import java.util.Scanner;

public class Check {
    public static void main(String args[])
    {
        System.out.println("enter no");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
       else
        {
            System.out.println("odd");
        }
        
}}
