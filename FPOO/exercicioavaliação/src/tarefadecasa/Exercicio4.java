package tarefadecasa;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double S, T;
		System.out.println("Digite a distancia em Km");
		S = ler.nextDouble();
		T = (S / 900);
		System.out.printf("O tempo necessario at� o fim da viagem � %s horas", T);
	}

}
