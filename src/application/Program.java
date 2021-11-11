package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangle x,y; // estou chamando a classe Triangle criada lá, nesse caso preciso apertar CRTL+Shift+O para importar
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangle x: ");
		x.a = input.nextDouble(); // aqui eu estou acessando o arquivo a,b,c
		x.b= input.nextDouble(); // fazendo a leitura
		x.c = input.nextDouble();
		System.out.println("Enter the measure of triangle y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		/* double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		*/
		
		double areaX = x.area(); // aqui eu estou chamando o método area, ao inves de fazer como ta na parte de cima
		double areaY = y.area(); // mesmo esquema com o Y, chamando o método area criado na classe triangle
		
		/* p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.));
		*/
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		input.close();
	}

}
