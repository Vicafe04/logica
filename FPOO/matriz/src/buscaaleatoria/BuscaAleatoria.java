package buscaaleatoria;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatoria {
	
	static Random r = new Random();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException {
		System.out.println("Digite quantos numeros deseja: ");
		int n = scan.nextInt();
		int dados[] = numerosAleatorios(n);
		System.out.println("Digite um numero que deseja buscar: ");
		int b = scan.nextInt();
		boolean encontrado = false;
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
			if(dados[i] == b)
				encontrado = true;
		System.out.println("A busca obteve sucesso?"+encontrado);

	}

	private static boolean buscaSimples(int[] dados, int b) {
		for(int i = 0; i < dados.length; i++)
			if(dados[i] == b)
				return true;
		return false;
	}

	private static int[] numerosAleatorios(int n) {
		int[] x = new int [n];
		for(int i = 0; i < n; i++) 
			x[i] = r.nextInt(100);
		return x;
	}

}
