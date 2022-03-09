package modulo;

import java.util.Scanner;

public class ExercicioLaço4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int r = f;
		
		for(int i = f; i > 1; i--) {
			r *= i;
			System.out.println(r);
		}

	}

}
