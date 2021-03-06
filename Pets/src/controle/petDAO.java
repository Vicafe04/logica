package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Pet;

public class petDAO {
	private BufferedReader br;
	private BufferedWriter bw;
	private String path = "./dados/pets.csv";
	
	public ArrayList<Pet> ler(){
		ArrayList<Pet> linhas = new ArrayList<>();
		Pet p;
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while(linha != null) {
				p = new Pet(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
	
	public void escrever(ArrayList<Pet> linhas) {
		
	}
}