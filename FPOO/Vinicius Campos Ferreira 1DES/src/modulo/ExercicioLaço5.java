package modulo;

public class ExercicioLa�o5 {

	public static void main(String[] args) {
		//valor do xerox
		final double vl = 0.06;
		//contagem do numero de xerox
		int cont = 1;
		//o primeiro "for" representa as linhas de 1 a 10 criadas
		for(int i = 0; i < 20; i++) {
			//o segundo "for" � responsav�l pela cria��o dos 10 valores em cada linha, o 1� "for" s� sera executado depois que o valor de "j"
			//no 2� "for" ser somado at� o 10 e ent�o o 1� "for" cria a segunda linha para que o comando se repit.
			for(int j = 0; j < 10; j++) {
				System.out.printf(" |%d R$ %.2f| ",cont,vl*cont);
				cont++;
			}
			System.out.println();
		}

	}

}
