package modelo;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A, B, C, delta;
		double r1, r2;
		
		System.out.println("calculo de bhaskara");
		
		System.out.println("Digite 3 valores equivalentes as incognitas A, B, C.");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		delta = B * B - 4 * A * C;
		
		if(delta>=0) {
			r1 = (-B + Math.sqrt(delta))/(2*A);
			r2 = (-B - Math.sqrt(delta))/(2*A);
		}else{
			System.out.println("Delta não pussui raiz.");
		}
	}
}
