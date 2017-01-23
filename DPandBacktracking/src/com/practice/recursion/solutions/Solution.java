package com.practice.recursion.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	int sum = 0;
    public static void main(String[] args) throws FileNotFoundException 
    {
        int n;
        Scanner s = new Scanner(new File("C:/D_Drive/Study/ProgInput/input.txt"));
      
        
        int a = s.nextInt();
       
        Solution obj = new Solution();
        obj.print(5,'A', 'B', 'C');
    }
    void print(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
         } else {
            print(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            print(topN - 1, inter, from, to);
         }
      }
}
