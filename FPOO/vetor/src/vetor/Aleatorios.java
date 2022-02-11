package vetor;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
    public static Scanner ler;

public static void main(String[] args) throws IOException {

ler = new Scanner (System.in);
int menu = 0;
while(menu != 4) {

System.out.print("1 - Numeros Inteiros\n2 - Numeros Reais\n3 - Nomes\n4 - Sair");

menu = ler.nextInt();

	switch(menu){
	case 1:
		GerarInteiro();
		System.out.println("");
		break;

	case 2:
		System.out.println("");
		break;

	case 3:
		System.out.println("");
		break;

	case 4:
		System.out.println("");
	break;

	default:
		System.out.println("Parabéns");
	break;

		}
	}
}

	public static void GerarInteiro(){
		ler = new Scanner(System.in);
		Random rand = new Random();

	System.out.println("Digite quantos numero deseja gerar: ");
	int qntd = ler.nextInt();
	int[] numeros = new int [qntd];

	for (int i =0; i < qntd; i++) {
	numeros [i] = rand.nextInt();
	System.out.println(numeros [i]);

		}
	}
}