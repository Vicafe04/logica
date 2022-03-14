package notas;

import java.util.Scanner;
import notas.Notas;

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
	
	public static void nota() {
		
		System.out.println("Cadastro de notas");
		double MP,n1,n2,n3,p1,p2,p3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        p1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        p3 = sc.nextDouble();
        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println(MP);
        System.out.printf("A sua média final é %.0f",MP);
		
        }
		
	
	public static void mediaSOP() {
		double MP,n1,n2,n3,p1,p2,p3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        p1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        p3 = sc.nextDouble();
        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println(MP);
        System.out.printf("A sua nota final de SOP é %.0f",MP);
		
	}
	public static void mediaLIMA() {
		double MP,n1,n2,n3,p1,p2,p3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        p1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        p3 = sc.nextDouble();
        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println(MP);
        System.out.printf("A sua nota final de LIMA é %.0f",MP);
		
	}
	public static void mediaHARE() {
		double MP,n1,n2,n3,p1,p2,p3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        p1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        p3 = sc.nextDouble();
        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println(MP);
        System.out.printf("A sua nota final de HARE é %.0f",MP);
		
	}
	public static void mediaFPOO() {
		double MP,n1,n2,n3,p1,p2,p3;
        System.out.println("Digite a média e o peso da primeira prova");
        n1 = sc.nextDouble();
        p1 = sc.nextDouble();
        System.out.println("Digite a média e o peso da segunda prova");
        n2 = sc.nextDouble();
        p2 = sc.nextDouble();
        System.out.println("Digite a média e o peso da terceira prova");
        n3 = sc.nextDouble();
        p3 = sc.nextDouble();
        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println(MP);
        System.out.printf("A sua nota final de FPOO é %.0f",MP);
	}

}
