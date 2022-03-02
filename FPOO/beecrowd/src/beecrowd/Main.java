package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        int id = ler.nextInt();
        int a = ler.nextInt();
        id -= a;
        
        System.out.println(a);
    }
 
}