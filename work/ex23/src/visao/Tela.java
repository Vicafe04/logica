package visao;

import java.util.Scanner;

import controle.ProcessoPlanilha;

public class Tela {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ProcessoPlanilha.carregar();
		int menu = 0;
		while (menu != 5) {
			System.out.println("Escolha uma op��o:");
			System.out.println("1 - Soma\n2 - multiplica��o\n3 - subtra��o\n4 - Divis�o\n5 - Sair");
			menu = scan.nextInt();
			ProcessoPlanilha.saida(menu);
		}
	}
}

