package modulo;

import java.util.Scanner;

public class Exe5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite 20 valores inteiros neste vetor: ");
		int n[] = new int[20];
		int n2[] = new int[20];
		for (int i = 0; i < 20; i++) {
			n[i] = sc.nextInt();
		}
		System.out.println("Digite mais 20 valores inteiros neste vetor: ");
		for(int i = 0; i < 20; i++) {
			n2[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("A diferença entre esses valores é: ");
		int n3[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n3[i] = n[i] - n2[i];
			System.out.println(n3[i]);
		}
		System.out.println();
		System.out.println("A soma entre esses valores é: ");
		int n4[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n4[i] = n[i] + n2[i];
			System.out.println(n4[i]);
		}
		System.out.println();
		System.out.println("A multiplicação entre esses valores é: ");
		int n5[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n5[i] = n[i] * n2[i];
			System.out.println(n5[i]);
		}
	}

}
/*Faça um programa que leia e monte dois vetores de números inteiros
com 20 números cada. Depois de montados gere um terceiro vetor formado
pela diferença dos dois vetores lidos, um quarto vetor formado pela
soma dos dois vetores lidos e por último um quinto vetor formado pela
multiplicação dos dois vetores lidos.*/