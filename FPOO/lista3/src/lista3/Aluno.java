package lista3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		double salario;
		while (opcao != 4) {
		System.out.println("Digite o nome do funcionário:");
		String nome = ler.nextLine();
		System.out.println("Digite o salário do funcionário:");
		salario = ler.nextFloat();
		
		System.out.println("Digite 1 para ver seu INSS");
		System.out.println("Digite 2 para ver seu IRRF");
		System.out.println("Digite 3 para ver seu FGTS");
		System.out.println("Digite 4 para sair");
		opcao = ler.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Nome: "+nome);
			double desconto;
			float porcentagem;
			if(salario > 7087.22) {
				porcentagem = 0f;
			}else if(salario > 3641.03) {
				porcentagem = 14f;
			}else if(salario > 2427.35){
				porcentagem = 12f;
			}else if(salario > 1212.01){
				porcentagem = 9f;
			} else {
				porcentagem = 7.5f;		
			} 
			if(porcentagem == 0f)
				desconto = 992.21;
			else
				desconto = salario * porcentagem / 100;	
			
			System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagem);
			System.out.printf("O desconto de INSS é %.2f\n",desconto);
			System.out.printf("Você vai receber %.2f\n",salario  - desconto);
			break;
		case 2:break;
		case 3:break;
		case 4:break;

		}
		}
		
	}

}
