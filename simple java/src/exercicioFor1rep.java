import java.util.Scanner;

public class exercicioFor1rep {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número menor que 1000:");
		x = input.nextInt();
		
		for (int i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println("Números ímpares " + i);
			}
		}
		input.close();
	}

}
