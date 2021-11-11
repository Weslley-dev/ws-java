import java.util.Scanner;
public class exercicioQuatro {

	public static void main(String[] args) {
		
		double horas, cod, valor, sal;

		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o seu código de funcionário:");
		
		cod = input.nextDouble();
		
		System.out.println("Digite o seu número de horas trabalhadas: ");
		
		horas = input.nextDouble();
		
		System.out.println("Agora digite o valor que você ganha por hora. ");
		valor = input.nextDouble();
		
		sal = horas * valor;
		
		System.out.println("----------Número do funcionário: " + cod + "----------");
		System.out.println("----------Saláro do funcionário U$: "+ sal + "----------");
		
	}

}
