package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Cao;
import modelo.Gato;

public class Principal {

	private static Scanner leia = new Scanner(System.in);
	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();

	public static void main(String[] args) {
		int menu = 0;
		while (menu != 5) {
			System.out.println(
					"Escolha:\n[1]Cadastrar cachorro.\t[2]Cadastrar gato.\n[3]Listar cachorro.\t[4]Listar gato\t[5]Sair.\nR:");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				limparTela();
				cadastrarCahorro();
				break;
			case 2:
				limparTela();
				cadastrarGato();
				break;
			case 3:
				listarCachorro();
				break;
			case 4:
				listarGatos();
				break;
			case 5:
				limparTela();
				System.out.println("Obrigado por usar nossos sistemas!!!");
				break;
			default:
				System.out.println("Tente novamente!!!");
				break;
			}
		}
	}

	private static void limparTela() {
		for (int i = 0; i < 200; i++) {
			System.out.println();
		}
		
	}

	private static void listarGatos() {
		limparTela();
		for (Gato g : gatos) {
			System.out.println(g.toString());
		}
		
	}

	private static void listarCachorro() {
		limparTela();
		for (Cao c : caes) {
			System.out.println(c.toString());
		}
	}

	private static void cadastrarGato() {
		System.out.println("especie\tnome\tpeso\traca\tquantidade de vidas");
		Gato gato = new Gato(leia.next(), leia.next(), leia.nextFloat(), leia.next(), leia.nextInt());
		gatos.add(gato);
		limparTela();
		System.out.println("Cadastrado com sucesso!\n\n");
	}

	private static void cadastrarCahorro() {
		System.out.println("especie\tnome\tpeso\traca\tquantidade de motoqueiros atacados");
		Cao cao = new Cao(leia.next(), leia.next(), leia.nextFloat(), leia.next(), leia.nextInt());
		caes.add(cao);
		limparTela();
		System.out.println("Cadastrado com sucesso!\n\n");
	}

}
