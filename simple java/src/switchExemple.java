import java.util.Scanner;
public class switchExemple {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número do dia da semana: ");
		x = input.nextInt();
		
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
			
		default: 
			dia = "Valor inválido!";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		input.close();
	}

}
