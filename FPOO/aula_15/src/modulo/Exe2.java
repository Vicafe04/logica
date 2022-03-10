package modulo;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 números: ");

		int[] nums1 = new int[10];
		int[] nums2 = new int[10];

		for (int i = 0; i < 10; i++) {
			nums1[i] = sc.nextInt();

		}
		int aux = 0;
		for (int i = 9; i >= 0; i--) {
			nums2[i] = nums1[aux];
			aux++;

		}
		System.out.println("output");
		for (int i = 9; i >= 0; i--) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println(" ");
		System.out.println("output invertido");
		for (int i = 9; i >= 0; i--) {
			System.out.print(nums1[i] + " ");
		}
	}
}