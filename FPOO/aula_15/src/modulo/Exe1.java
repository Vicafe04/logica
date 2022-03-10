package modulo;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++) {
		nums[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("output");
		for(int i = 0; i < 10 ;i++) {
		System.out.println(nums[i] + " ");
		}
		System.out.println();
		System.out.println("output invertido");
		for(int i = nums.length -1; i >= 0 ;i--) {
		System.out.println(nums[i] + " ");
				}
	}

}
