import java.util.Scanner;
public class exercicioQuatro {

	public static void main(String[] args) {
		
		double horas, cod, valor, sal;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o seu c�digo de funcion�rio:");
		
		cod = input.nextDouble();
		
		System.out.println("Digite o seu n�mero de horas trabalhadas: ");
		
		horas = input.nextDouble();
		
		System.out.println("Agora digite o valor que voc� ganha por hora. ");
		valor = input.nextDouble();
		
		sal = horas * valor;
		
		System.out.println("----------N�mero do funcion�rio: " + cod + "----------");
		System.out.println("----------Sal�ro do funcion�rio U$: "+ sal + "----------");
		
	}

}
