package day5loops;

import java.util.Scanner;

public class Solution {

	private int testcases;

	public void readNumbers() {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for (int i = testcases; i > 0; i--) {
			this.compute(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
	}

	public void compute(int a, int b, int n) {
		int num = a;
		for (int i = 0; i < n; i++) {
			num += Math.pow(2, i) * b;
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.readNumbers();
	}

}
