package lista3;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 11) {
			System.out.println("Digite uma opção:");
			System.out.println("1-Programa1/t5-Programa5/t9-Programa9");
			System.out.println("2-Programa1/t6-Programa5/t10-Programa9");
			System.out.println("3-Programa1/t7-Programa5/t11-Programa9");
			System.out.println("4-Programa1/t8-Programa5");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				for(int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for(int i = 200; i > 0; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("Digite um valor inteiro:");
				int valor = ler.nextInt();
				for (int i = 0; i < valor; i++) {
					System.out.println(i);
				}
				break;
			case 4:
				System.out.println("Digite 2 valores inteiros");
				int A=ler.nextInt(), B=ler.nextInt();
				
				if (A < B) {
					for (int i = A; i <= B; i++) {
						System.out.println(i);
						}
				}else{
					for (int i = B; i <= A; i++) {
						System.out.println(i);
						}
				}
				break;
			case 5:
				System.out.println("Digite um número");
				int C = ler.nextInt();
				for (int i = 0; i <= C; i += 2) {
					System.out.println(i);
				}
				break;
			case 6:
				int soma = 0;
				for (int i = 0; i <= 100; i++) {
				soma += i;
				}
				System.out.println(soma);
				break;
			case 7:
				
	}
		

	}

	}
}
