package modulo;

import java.util.Scanner;

public class ExercicioLaço2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite 2 numeros inteiro: ");
		System.out.println("coloque o menor numero: ");
		a = sc.nextInt();
		System.out.println("coloque o maior numero: ");
		b = sc.nextInt();
		System.out.println();
		System.out.println("Os numeros pares são: ");
		if(a % 2 != 1)
			a++;
			
			for(int i = a; i <= b; i += 2) {
				System.out.println(i);
				sc.close();
			}
		}
	}