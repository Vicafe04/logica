package tarefadecasa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, R;
		
		System.out.println("Calcule (A+B)/C");
		System.out.println("Digite o valor de A");
		a = ler.nextInt();
		System.out.println("Digite o valor de B");
		b = ler.nextInt();
		System.out.println("Digite o valor de C");
		c = ler.nextInt();
		
		R = (a+b)/c;
		System.out.println(R);
	}

}
