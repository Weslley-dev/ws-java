import java.util.Scanner;
public class exercicioCinco {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double value, price, uni, code;
		double value2, price2, uni2, code2;
		double soma1,soma2,valorfinal;
		
		System.out.println("Digite o c�digo da pe�a 1: ");
		code = input.nextDouble();
		
		System.out.println("Digite o n�mero de pe�as 1:");
		uni = input.nextDouble();
		
		System.out.println("Digite o valor unit�rio da pe�a 1: ");
		value = input.nextDouble();
		
		
		System.out.println("Digite o c�digo da pe�a 2: ");
		code2 = input.nextDouble();
		
		System.out.println("Digite o n�mero de pe�as 2:");
		uni2 = input.nextDouble();
		
		System.out.println("Digite o valor unit�rio da pe�a 2: ");
		value2 = input.nextDouble();
		
		
		soma1 = uni * value;
		soma2 = uni2 * value2;
		
		valorfinal = soma1+soma2;
		
		System.out.println("VALOR A PAGAR R$: " + valorfinal);
		
		
		input.close();
		
	}

}
