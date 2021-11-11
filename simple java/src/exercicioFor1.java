import java.util.Scanner;

public class exercicioFor1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;

		System.out.println("Digite um número: ");
		x = input.nextInt();

		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) { // eu tenho que fazer a comparação com o valor de i e nao com o x.
				// então nesse caso é um if dentro do for.
				System.out.println("O valores ímpares são: " + i);
			}
		}
		input.close();
	}
}
