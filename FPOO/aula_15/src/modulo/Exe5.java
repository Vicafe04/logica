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
		System.out.println("A diferen�a entre esses valores �: ");
		int n3[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n3[i] = n[i] - n2[i];
			System.out.println(n3[i]);
		}
		System.out.println();
		System.out.println("A soma entre esses valores �: ");
		int n4[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n4[i] = n[i] + n2[i];
			System.out.println(n4[i]);
		}
		System.out.println();
		System.out.println("A multiplica��o entre esses valores �: ");
		int n5[] = new int[20];
		for(int i = 0; i < 20; i++) {
			n5[i] = n[i] * n2[i];
			System.out.println(n5[i]);
		}
	}

}
/*Fa�a um programa que leia e monte dois vetores de n�meros inteiros
com 20 n�meros cada. Depois de montados gere um terceiro vetor formado
pela diferen�a dos dois vetores lidos, um quarto vetor formado pela
soma dos dois vetores lidos e por �ltimo um quinto vetor formado pela
multiplica��o dos dois vetores lidos.*/