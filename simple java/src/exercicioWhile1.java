import java.util.Scanner;

public class exercicioWhile1 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha:");
		senha = input.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			System.out.println("Digite a senha:");
			senha = input.nextInt();
		}
		
		System.out.println("Acesso permitido.");
		input.close();
		
	}

}
