package tarefadecasa;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//5 � Um caminh�o consegue transportar 18 toneladas de laranjas em uma 
		//viagem que faz entre a fazenda e a f�brica de suco de laranja. Um alqueire
		//de terra produz em m�dia 250 toneladas de laranjas. Fa�a um programa que
		//leia quantos caminh�es e quantos alqueires uma fazenda produtora de
		//laranjas possui, calcule e apresente na tela quantas viagens de 
		//caminh�o ser�o necess�rias para transportar toda a colheita de laranjas.
		Scanner ler = new Scanner(System.in);
		int C, A, V;
		System.out.println("quantia de caminhoes");
		C = ler.nextInt();
		System.out.println("quantia de alqueires");
		A = ler.nextInt();
		V = ((A * 250)/C) * 18;
		System.out.println("A quantia de viagens necess�rias para transportar toda a colheita de laranjas � = "+V);
	}

}
