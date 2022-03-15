package modulo;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		System.out.println("Digite 10 numeros positivos");
		Scanner sc = new Scanner(System.in);
		int[] n2 = new int[10];
		int[] n = new int[10];
		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (n[i] % 2 == 0) {
				n2[i] = n[i];
				System.out.println("par");
				System.out.println(n2[i]);
			} else if (n[i] % 2 != 0) {
				System.out.println("impar");
				System.out.println(n[i]);
			}
		}
	}
}
/*
 * Ler um vetor de 10 elementos inteiros e positivos. Criar um segundo vetor da
 * seguinte forma: os elementos de índice par receberão os respectivos elementos
 * divididos por 2; os elementos de índice ímpar receberão os respectivos
 * elementos multiplicados por 3. Imprima os dois vetores.
 */