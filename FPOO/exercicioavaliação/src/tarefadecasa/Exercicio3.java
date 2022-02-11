package tarefadecasa;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int N, x, y;
		System.out.println("Digite um numero inteiro, positivo e diferente de zero");
		N = ler.nextInt();
		
		x = N+1;
		y = N-1;
		
		if (N > 0) {
			System.out.println("N + 1 =" + x);
			System.out.println("N - 1 =" + y);
		}else{
		System.out.println("ERRO");
		ler.close();
		}
	}

}
