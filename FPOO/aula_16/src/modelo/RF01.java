package modelo;

import java.util.Scanner;

public class RF01 {
	static Scanner	sc = new Scanner(System.in);
	public static void main(String[] args) {
		nota();
	}
	public static void nota() {
		int numero = 0;
		
		System.out.println("Cadastro de notas");
		System.out.println("1-FPOO| 2-HARE| 3-LIMA| 4-SOP| 5-SAIR");
		numero = sc.nextInt();
        switch (numero){
            case 1:
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
                break;
            case 2:
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
                break;
            case 3:
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
                break;
            case 4:
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
                break;
            case 5:
            default:System.out.println("tchau");
            break;
                
        }
		
	}

}
