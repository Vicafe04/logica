package visao;

import java.util.Scanner;

import modelo.Veiculo;

public class Menu {
	
	private static Scanner sc = new Scanner(System.in);
	private static Veiculo Veiculos[] = new Veiculo[10];
	private static String itens[] = {"Cadastrar veiculo", "Listar Veiculo", "Sair"};
	private static int menu = 0;
	private static int indice = 0;

	public static void main(String[] args) {
		while(menu != 3) {
			menu = printMenu(itens);
		switch (menu) {

		case 1:
			cadastrarVeiculos();
			break;
		case 2:
			listarVeiculos();
			break;
		case 3:
			System.out.println("flws");
			break;
		}
		}
	}

	private static int printMenu(String[] itens) {
		for(int i = 0; i < itens.length; i++)
			System.out.println((i + 1) + "." + itens[i]);
		System.out.println("Escolha uma opção: ");
		return sc.nextInt();
	}

	private static void listarVeiculos() {
		for(int i = 0; i < indice; i++) {
			System.out.println(Veiculos[i].toString());
		}
		
	}

	private static void cadastrarVeiculos() {
		System.out.println("Placa\tMarca\tModelo\tCor\tAno Modelo\tAno Fabricação");
		Veiculos[indice] = new Veiculo(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
		indice++;
		}
	}