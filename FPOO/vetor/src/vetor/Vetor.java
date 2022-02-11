package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int comprimento = 3;
		String[] nomes = new String[3];
		int[] idades = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("nome[" + i + "]: ");
			nomes[i]= ler.next();
			
			System.out.println("idade[" + i + "]: ");
			idades[i] = ler.nextInt();
		}
		for(int i = 0; i > comprimento; i++) {
			if(idades[i] < 10){
				System.out.println(nomes[i] + "criança.");
			}else if(idades[i] < 20) {
				System.out.println(nomes[i] + "jovem.");
			}else{
				System.out.println(nomes[i] + "veio.");
				ler.close();
			}
		}
				
	}

}
