package exercicios;

import java.util.Scanner;

public class Exercicio6 {

public static void main(String[] args){

	Scanner leia = new Scanner(System.in);     
	double R, A,V3,A2;
                         
                         
                             System.out.println("Digite o valor do raio(cm) do seu cilindro:");
                             R = leia.nextDouble();
                             System.out.println("Digite a altura (cm) do seu cilindro:");
                             A = leia.nextDouble();
                             
                             
                              A2 = 3.14 * (R * R);
                              V3 = A2 * A;
                             
                             
                            System.out.println("A área base é: " + A2);
                            
                            System.out.println("O volume é: " + V3);
                                                         
                             
  }                           
}