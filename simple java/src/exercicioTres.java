import java.util.Scanner;
public class exercicioTres {

	public static void main(String[] args) {

	/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
	A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
	segundo a fórmula: DIFERENCA = (A * B - C * D). */
		
		double A,B,C,D, dif;
	
		Scanner input = new Scanner (System.in);
			System.out.println("Digite o valor de A: ");
				A = input.nextInt();
			System.out.println("Digite o valor de B: ");
				B = input.nextInt();
			System.out.println("Digite o valor de C: ");
				C = input.nextInt();
			System.out.println("Digite o valor de D: ");
				D = input.nextInt();
				
		dif = (A*B) - (C*D);
		
		System.out.println("A diferença é igual a: " + dif);
			

		
	}

}
