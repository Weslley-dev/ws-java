import java.util.Locale;
import java.util.Scanner;

public class exemploDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		/* while (resp != 'n') { // só funciona se usar aspas simples

			System.out.println("Digite a temperatura em Celsius: ");
			double c = input.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em farenheit: %.1f%n", f);
			System.out.println("Deseja repetir? S/N");
			resp = input.next().charAt(0);
		}
		input.close(); */
		
		char resp;
		do { 
			System.out.println("Digite a temperatura em Celsius: ");
			double c = input.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em farenheit: %.1f%n", f);
			System.out.println("Deseja repetir? S/N");
			resp = input.next().charAt(0);
		} 
		while (resp != 'n');
		
		input.close();
	}
}
