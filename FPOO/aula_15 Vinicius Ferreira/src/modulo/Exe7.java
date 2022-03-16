package modulo;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantia total de numeros de desejas comparar: ");
		int N = sc.nextInt();
		N /= 2;
		int[] n1 = new int[N];
		int[] n2 = new int[N];
		System.out.printf("Digite %d numeros 2 vezes para cada vetor X == X",N);
		for(int i = 0; i < N; i++) {
		n1[i] = sc.nextInt();
		n2[i] = sc.nextInt();
		}
		
		boolean iguais = false;

		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				iguais = true;
			} else {
				iguais = false;
				break;
			}
		}

		if (iguais) {
			System.out.println("São IGUAIS");
		} else {
			System.out.println("São DIFERENTES");
		}
		
	}	

}
//Dados dois vetores de tamanho N, faça uma função que diga se os mesmos possuam conteúdo igual.