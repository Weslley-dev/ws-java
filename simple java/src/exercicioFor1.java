import java.util.Scanner;

public class exercicioFor1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;

		System.out.println("Digite um n�mero: ");
		x = input.nextInt();

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) { // eu tenho que fazer a compara��o com o valor de i e nao com o x.
				// ent�o nesse caso � um if dentro do for.
				System.out.println("O valores �mpares s�o: " + i);
			}
		}
		input.close();
	}
}
