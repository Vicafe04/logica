package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//5 – Um caminhão consegue transportar 18 toneladas de laranjas em uma 
		//viagem que faz entre a fazenda e a fábrica de suco de laranja. Um alqueire
		//de terra produz em média 250 toneladas de laranjas. Faça um programa que
		//leia quantos caminhões e quantos alqueires uma fazenda produtora de
		//laranjas possui, calcule e apresente na tela quantas viagens de 
		//caminhão serão necessárias para transportar toda a colheita de laranjas.
		Scanner ler = new Scanner(System.in);
		int C, A, V;
		System.out.println("quantia de caminhoes");
		C = ler.nextInt();
		System.out.println("quantia de alqueires");
		A = ler.nextInt();
		V = (A * 250)/(C * 18);
		System.out.println("A quantia de viagens necessárias para transportar toda a colheita de laranjas é "+V);
	}

}
