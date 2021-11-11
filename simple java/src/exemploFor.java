import java.util.Scanner;

public class exemploFor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero: ");
		int n = input.nextInt();

		System.out.println("Numero teste");
		
		int soma = 0;
		
		
		for (int i=0; i < n; i++) {
			int x = input.nextInt();
			soma = soma + x;
		}
		
		System.out.println("A soma �: " + soma);
		
		for (int i =0; i < 5; i++) {
			System.out.println("Valor: " + i);
		}
		
		for (int i =4; i>=0;i--) {
			System.out.println("Valor decrescente: " + i);
		}
		
		
		input.close();
	}
	
	


}
