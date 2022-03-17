package modelo;

import java.util.Scanner;

public class Notas {
static Scanner	sc = new Scanner(System.in);
	
	public String componente;
	public float[] notas =  new float[3];
	
	public Notas() {
		
	}
	
	public Notas(String componente, float[] notas) {
		this.componente = componente;
		this.notas = notas;
	}
	
	public float media() {
		
		System.out.println("Cadastro de notas");
		double MP,n1,n2,n3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        MP = (n1 + n2 + n3)/3;
        System.out.println(MP);
        System.out.printf("A sua média final é %.1f",MP);
        }
}
