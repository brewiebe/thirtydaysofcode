package day6review;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private int size;
	public Solution(int n) {
		this.size = n;
		this.printStairs();
	}
	
	private void printStairs(){
		for(int i=0; i<size; i++){
			//computes number of spaces to print
			int spaces = (size-i); 
			//prints spaces
			for(int k = 1; k<spaces; k++) {
				System.out.print(" ");
			}
			//prints hashes
			for(int j = 0; j<=i; j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //create Solution object, calling constructor prints staircase
    	Solution s = new Solution(n);
    }
}