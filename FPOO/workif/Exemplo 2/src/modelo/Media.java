package modelo;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		int n1, n2, media;
		
		Scanner ler = new Scanner (System.in);
			
			System.out.println("Digite o primeiro número: ");	
			n1 = ler.nextInt();
			
			System.out.println("Digite o segundo número: ");
			n2 = ler.nextInt();
			
			media = (n1 + n2)/2;
			if(media >=5){
			System.out.println("Aluno aprovado");
			}else{
				System.out.println("Aluno reprovado");
			}
	}

}
