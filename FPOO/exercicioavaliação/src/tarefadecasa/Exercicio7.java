package tarefadecasa;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double D, M, V;
		System.out.println("Coloque a massa do elemento");
		M = ler.nextDouble();
		System.out.println("Coloque o volume do elemento");
		V = ler.nextDouble();
		D = M / V;
		System.out.println("A densidade do material é: "+D);

	}

}
