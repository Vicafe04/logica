package modelo;

import java.util.Scanner;

import modelo.Alunos;

public class Alunos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		float[] n = {1,2,3};
		
		Notas notas = new Notas("FPOO", n);
		CAluno();

	}
	public static void CAluno() {
		System.out.println("Digite a quantia de alunos que deseja cadastrar: ");
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
		System.out.println("Digite o RA do aluno: ");
		int[] RA = new int[N];
		RA[i] = sc.nextInt();
		System.out.println("Digite o nome do aluno");
		String Nome[] = new String[N];
		Nome[i] = sc.next();
		System.out.println("Digite a data de nascimento do Aluno (EX: 01/01/1999)");
		String nasc[] = new String[N];
		nasc[i] = sc.next();
		}
		
		
		
		
		
	}

}
