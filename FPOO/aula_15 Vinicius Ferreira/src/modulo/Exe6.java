package modulo;

import java.util.Arrays;
import java.util.Scanner;

public class Exe6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite a quantia de numeros de desejas comparar: ");
		int nums = sc.nextInt();

		int[] n = new int[nums];

		int impar = 0, par = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite um número");
			n[i] = sc.nextInt();

			if (n[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		int[] impar2 = new int[impar];
		int[] par2 = new int[par];

		for (int i = 0; i < par2.length; i++) {
			par2[i] = 1;
		}

		for (int i = 0; i < impar2.length; i++) {
			impar2[i] = 0;
		}

		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 0) {
				for (int j = 0; j < par2.length; j++) {
					if (par2[j] == 1) {
						par2[j] = n[i];
						break;
					}
				}
			} else {
				for (int j = 0; j < impar2.length; j++) {
					if (impar2[j] == 0) {
						impar2[j] = n[i];
						break;
					}
				}
			}
		}

		Arrays.sort(par2);
		Arrays.sort(impar2);

		System.out.println("Pares:");

		for (int i = 0; i < par2.length; i++) {
			System.out.print(par2[i] + " ");
		}

		System.out.println("\n\nImpares:");

		for (int i = impar2.length - 1; i >= 0; i--) {
			System.out.print(impar2[i] + " ");
		}
		System.out.println("");
	}
}

/*
 * Utilizando vetores, crie um programa que organize uma quantidade qualquer de
 * números inteiros fornecidos pelo usuário da seguinte forma: primeiro os
 * números pares em ordem crescente e depois os números ímpares em ordem
 * decrescente.
 */