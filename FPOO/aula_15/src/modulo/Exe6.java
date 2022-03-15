package modulo;

import java.util.Arrays;
import java.util.Scanner;

public class Exe6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Forneça a quantia de numeros inteiros que desejas comparar: ");
		int nums = sc.nextInt();
		int[] n = new int[nums];
		int impar = 0;
		int par = 0;
		System.out.println("Digite os numeros que desejas comparar: ");
		for (int i = 0; i < nums; i++) {
			n[i] = sc.nextInt();
			if (n[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}

			int par2[] = new int[par];
			int impar2[] = new int[impar];

			for (int j = 0; j < nums; j++) {
				n[i] = sc.nextInt();
				if (n[j] % 2 == 0) {
					par2[j] = n[j];
				} else {
					impar2[j] = n[j];
				}

			}
			for (int k = 0; k < nums; k++) {
				System.out.println(impar2[k]);
				System.out.println(par2[k]);
			}
		}
	}
}

/*
 * Utilizando vetores, crie um programa que organize uma quantidade qualquer de
 * números inteiros fornecidos pelo usuário da seguinte forma: primeiro os
 * números pares em ordem crescente e depois os números ímpares em ordem
 * decrescente.
 */