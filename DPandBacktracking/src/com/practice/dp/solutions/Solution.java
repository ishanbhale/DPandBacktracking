package com.practice.dp.solutions;

import com.practice.dp.MinCoinChange;

public class Solution {
	
	static int max_lis_length; // stores the final LIS

	//Recursive implementation for calculating the LIS
	static int _lis(int arr[], int n)
	{
		int current_lis_length = 1;
		

		return current_lis_length;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
		int n = arr.length;
		System.out.println("Length of LIS is " + _lis( arr, n ));
	}

}
