package tarefadecasa;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int v1, v2, v3;
		System.out.println("divida o primeiro valor digitado pelo segundo valor digitado");
		System.out.println("Coloque o primeiro valor");
		v1 = ler.nextInt();
		System.out.println("Coloque o segundo valor");
		v2 = ler.nextInt();
		v3 = v1 / v2;
		System.out.println("O resultado é: " + v3);
		
	}

}
