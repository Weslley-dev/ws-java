import java.util.Scanner;


public class exemploWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// ctrl+shift+o importa o java.util.Scanner;
		
		System.out.println("Digite um número: ");
		int x = input.nextInt();
		int soma = 0;
		while (x != 0) {
			x = input.nextInt(); 
			soma = soma + x; 
			// ou soma += x; o valor vai somar com os valores de x
		// enquanto o x for diferente de 0, o programa vai ler o valor novamente
			
		}
		System.out.println("Você digitou zero. Programa encerrado!");
		System.out.println("Soma dos valores digitados: " + soma);
		input.close();	
	}
}
