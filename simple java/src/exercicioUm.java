import java.util.Scanner;
public class exercicioUm {

	public static void main(String[] args) {

	/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela 
	a soma desses números com uma mensagem explicativa, conforme exemplos. */
		
		
		Scanner input = new Scanner (System.in);
		
		double x,y, soma;
		
		System.out.println("Digite um valor: ");
		x = input.nextDouble();
		
		System.out.println("Digite outro valor: ");
		y = input.nextDouble();
		
		soma = x + y;
		
		System.out.println("Entrada: " + x + " e " + y);
		System.out.println("SOMA: " + soma);
	}
}
