package aula_16;

import java.util.Scanner;

public class RF01 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n;
		System.out.printf("Digite a quantia de Alunos que deseja cadastrar: ");
		n = sc.nextInt();
		char[] inputS = new char [n];
		inputS[n] = (char) sc.nextLong();
		System.out.println(inputS);
		
		

	}

}
