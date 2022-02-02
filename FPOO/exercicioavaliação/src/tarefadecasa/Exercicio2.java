package tarefadecasa;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float T, V, S;
		System.out.println("Calculo do tempo necessário para ir de um ponto ao outro em Km/h");
		System.out.println("ΔS x V = ΔT");
		System.out.println("Digite a velocidade em Km/h");
		V = ler.nextFloat();
		System.out.println("Digite o espaço percorrido em Km");
		S = ler.nextFloat();
		
		T = S / V;
		System.out.println(T);
	}

}
