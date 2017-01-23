package com.practice.recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Sum_Numbers 
{
    int sum = 0, j = 0;
    public static void main(String[] args) throws FileNotFoundException 
    {
        int n;
        Scanner s = new Scanner(new File("C:/D_Drive/Study/ProgInput/input.txt"));
        n = s.nextInt();
        System.out.println("No. of elements: " + n);
        
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Sum_Numbers obj = new Sum_Numbers();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum: "+x);
    }
    
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}
   

