package visao;

import java.util.Scanner;

import modelo.Aluno;

public class Principal {

	public static Scanner sc = new Scanner(System.in);
	public static int menu = 0;
	public static Aluno alunos[] = new Aluno[10];

	public static void main(String[] args) {
		while (menu != 9) {
			System.out.println("1.Cadastrar aluno\n2.Cadastrar notas\n3.\n4.\n5.r.\n9.Sair");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				cadastrarNota();
				break;
			case 3:
				listarAlunos();
				break;
			case 4:
				listarNotas();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("Tchau");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}

	}

	private static void listarNotas() {
		// TODO Auto-generated method stub
		
	}

	private static void listarAlunos() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarNota() {
		
	}
	
	@SuppressWarnings("unused")
	private static void cadastrarAluno() {
		System.out.println("Digite quantos alunos deseja cadastrar: ");
		int N = sc.nextInt();
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] == null) {
				System.out.println("Digite o RA do aluno: ");
				int ra = sc.nextInt();
				System.out.println("Digite o nome doxx aluno: ");
				String nome = sc.next();
				System.out.println("Digite a data de nascimento: ");
				String nasc = sc.next();
			}
			}
			}
			}
		
		
	}