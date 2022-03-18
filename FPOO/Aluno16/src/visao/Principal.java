package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.Nota;
import modelo.Aluno;

public class Principal {

	public static Scanner sc = new Scanner(System.in);
	public static int menu = 0;
	static int CAlunos = 0;
	public static Aluno alunos[] = new Aluno[10];

	public static void main(String[] args) throws ParseException {
		while (menu != 9) {
			System.out.println("1.Cadastrar aluno\n2.Cadastrar notas\n3.Listar alunos\n4.Listar notas\n5.Obter dados de um aluno.\n9.Sair");
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
				obterDados();
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

	private static void obterDados() {
		System.out.println("Coloque o ra do aluno que desejas procurar");
		if(alunos[i].ra = )
		
	}

	private static void listarNotas() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				
				System.out.println(alunos[i].nome);
				
				System.out.println("\tComp.\tNota 1\tNota 2\tNota 3\tMédia\n");
				for (int j = 0; j < alunos[i].notas.length; j++) {
					System.out.print("\t" + alunos[i].notas[j].componente);
					for (int j2 = 0; j2 < alunos[i].notas[j].notas.length; j2++) {
						System.out.print("\t" + alunos[i].notas[j].notas[j2]);
					}
					if(alunos[i].notas[j].obterMedia() <= 50) {
						System.out.printf("\t%.2f reprovado", alunos[i].notas[j].obterMedia());
						System.out.println("\n");
					} else {
						System.out.printf("\t%.2f aprovado", alunos[i].notas[j].obterMedia());
						System.out.println("\n");
					}
				}
				System.out.println(alunos[i].obterConceito());
				System.out.println("\n");
			}
			
		}
	}

	private static void listarAlunos() throws ParseException {
		System.out.printf("Lista de alunos cadastrados.");
		System.out.println("RA\tNome\tNascimento\tIdade");
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.println(alunos[i].ra + "\t" + alunos[i].nome + "\t" + new SimpleDateFormat("dd/MM/yyyy").format(alunos[i].nasc) + "\t" + alunos[i].calcIdade());
				System.out.println("");
			}
		}
	}

	private static void cadastrarNota() {
		System.out.println("Digite o RA do aluno cujo as notas serão cadastradas:");
		int ra = sc.nextInt();
	    
	    float[] nota = new float[3];
	    
	    for (int i = 0; i < alunos.length; i++) {
	    	if (alunos[i] != null) {
	    		if(alunos[i].ra == ra) {
					Nota[] notas = alunos[i].notas;
					for (int j = 0; j < 4; j++) {
						if (notas[j] == null) {
							System.out.println("Aluno(a): " + alunos[i].nome + ". Possui " + j + "/4 componentes cadastrados.\n");
							
							System.out.println("Digite o nome da matéria para inserir as notas");
							String componente = sc.next();
							
							for (int k = 0; k < 3; k++) {
								System.out.println("Digite a " + (k+1) + "ª Nota:");
								nota[k] = sc.nextFloat();
							}
							
							notas[j] = new Nota(componente, nota);
							
							alunos[i].notas = notas;
							break;
						}
						if (j == 3) {
							System.out.println("Limite de componentes atingido para " + alunos[i].nome + ". (4/4)");
						}
					}
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static void cadastrarAluno() throws ParseException {
		if (alunos[9] == null) {
			System.out.println("Digite quantos alunos deseja cadastrar: ");
		int N = sc.nextInt();
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] == null) {
				System.out.println("Digite o RA do aluno: ");
				int ra = sc.nextInt();
				System.out.println("Digite o nome do aluno: ");
				String nome = sc.next();
				System.out.println("Digite a data de nascimento: ");
				String nasc = sc.next();
				
				Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nasc);
				
				CAlunos++;
				alunos[i] = new Aluno(ra, nome, dataNascimento);
				System.out.println("Aluno cadastrado.");
				break;
			}
			}
		}
		}
	}
}