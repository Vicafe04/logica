package modulo;

import java.util.Scanner;

public class ExercicioLaço3 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Coloque 10 numeros e ache o maior e o menor entre eles");
		int[] nums = new int[10];
		
		for (int i = 0; i < 10; i++) {
			nums[i]  = sc.nextInt();
		}
		int maior = nums[1];
		int menor = nums[1];
		
		for (int i = 0; i < 10; i++) {
			if(nums[i] > maior) {
				maior = nums[i];
			}
			if (nums[i] < menor) {
				menor = nums[i];
			}
		}
		System.out.println("maior: "+ maior);
		System.out.println("menor: "+ menor);
	}
}
