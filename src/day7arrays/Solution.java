package day7arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private int arr[];
	private int N;
	public Solution(){
		Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
	}
	public void reverseArray(){
		for(int i=N-1; i >= 0; i--){
			System.out.print(arr[i]+" ");
		}
	}
	
    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverseArray();
    }
}
