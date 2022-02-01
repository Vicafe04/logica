package exercícios;

import java.util.Date;
import java.util.Scanner;

public class IdadeAno_V2 {

	public static void main(String[] args) {
		
		int a1, m1, d1;
		int A1, M1, D1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Data de nascimento");
		System.out.println("ano: ");
		a1 = ler.nextInt();
		System.out.println("mês: ");
		m1 = ler.nextInt();
		System.out.println("dia: ");
		d1 = ler.nextInt();
		System.out.println(new Date().getYear());
		System.out.println(new Date().getMonth());
		System.out.println(new Date().getDay());
		A1 = new Date().getYear();
		M1 = new Date().getMonth();
		D1 = new Date().getDay();
			if(A1 - a1 >=18){
			System.out.println("Parabéns, você já pode ser preso");
			}else{
			System.out.println("Fica tranquilo, você não tem nada com que se preocupar");	
			}
	}

}
