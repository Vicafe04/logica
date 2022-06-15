package visao;

import java.util.Scanner;

import controle.ProcessoPlanilha;

public class Tela {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ProcessoPlanilha.carregar();
		int menu = 0;
		while (menu != 5) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Soma\n2 - multiplicação\n3 - subtração\n4 - Divisão\n5 - Sair");
			menu = scan.nextInt();
			ProcessoPlanilha.saida(menu);
		}
	}
}

