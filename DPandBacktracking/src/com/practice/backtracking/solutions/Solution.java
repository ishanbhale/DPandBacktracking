package com.practice.backtracking.solutions;

public class Solution {
	public static void main(String args[])
	{
		Solution rat = new Solution();
		int maze[][] = {{1, 0, 0, 0},
			{1, 1, 0, 1},
			{0, 1, 0, 0},
			{1, 1, 1, 1}
		};
		rat.solveMaze(maze);
	}
	
	boolean solveMaze(int maze[][])
	{
		int sol[][] = {{0, 0, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 0, 0}
		};

		return true;
	}

	
	
}
