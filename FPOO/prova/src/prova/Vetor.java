package prova;

import java.util.Random;

public class Vetor {
	

	public static void main(String[] args) {
		
	}
		
	public static void imprimirvetor() {;
	
		String [] nome = new String[4];
		nome [0] = "Bruno";
		nome [1] = "Filipe";
		nome [2] = "Luiz";
		nome [3] = "Carlos";
		
		String [] sobrenome = new String[4];
		nome [0] = "Roberto";
		nome [1] = "Pinto";
		nome [2] = "Catão";
		nome [3] = "Testa";
		
		int [] numeros = new int [3];
		numeros[1]=2;
		Random aleatorio = new Random();
		for (int i = 0; i < 4; i++) {
			int numero_aleatorio = aleatorio.nextInt(nome.length);
		}
		
		
				
	}
	}


