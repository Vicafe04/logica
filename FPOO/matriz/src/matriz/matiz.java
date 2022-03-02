package matriz;

import java.io.IOException;

import java.util.Random;

public class matiz {

	static Random rand = new Random();

	public static void main(String[] args) throws IOException {
		
		matriz3d(3,3,3);
		
	}

	static void vetor() {
		int[] x = new int[27];
		for (int i = 0; i < 27; i++) {
				x[i] = rand.nextInt(100);
		}
		
		for (int i = 0; i < 27; i++) {
				System.out.print(x[i]+"\t");
		}
	}
	
	
	static void matriz(int l, int c) {
		int[][] x = new int[l][c];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++)
				x[i][j] = rand.nextInt(100);
		}
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}
	
	static void matriz3d(int x, int y, int z){
		int m3 [][][] = new int[x][y][z];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < z; k++) {
					m3[i][j][k] = rand.nextInt(100);
					System.out.printf(m3[i][j][k]+"\t");
					System.out.println();
				}			
			}
		}
	}
}


