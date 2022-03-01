package beecrowd;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) throws IOException {
    	Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double A,B,C;

        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        
        double tri = (A*C)/2;
        double cir = 2*3.14159 * C;
        double trap = ((A + B)* C)/2;
        double qua = B * B;
        double ret = A * B;
        
        System.out.printf("TRIANGULO: %.3f %n",tri);
        System.out.printf("CIRCULO: %.3f %n",cir);
        System.out.printf("TRAPEZIO: %.3f %n",trap);
        System.out.printf("QUADRADO: %.3f %n",qua);
        System.out.printf("RETANGULO: %.3f %n",ret);
        System.out.println();
        
    }
 
}