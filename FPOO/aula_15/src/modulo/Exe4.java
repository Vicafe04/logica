package modulo;

import java.util.Scanner;

public class Exe4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o nome de 10 pessoas e procure pelo nome dela na lista: ");
		String nome[] = new String[10];
		for (int i = 0; i < 10; i++) {
			nome[i] = sc.nextLine();
		}
		String aux = "nao achei";
		System.out.println("Procure pelo nome");
		String aux2 = sc.nextLine();
		for (int j = 0; j < 10; j++) {
			if (nome[j].equals(aux2)) {
				aux = "achei";
			}
			
		}
		System.out.println(aux);
	}
}
/*
 * Ler um vetor com 10 nomes de pessoas, após pedir que o usuário digite um nome
 * qualquer de pessoa. Escrever a mensagem “ACHEI”, se o nome estiver armazenado
 * no vetor C ou “NÃO ACHEI” caso contrário.
 */