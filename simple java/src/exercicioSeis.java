import java.util.Scanner;
public class exercicioSeis {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		float A, B, C;
		double triangulo, area, trapezio, quadrado, retangulo;
		double pi;
		
		pi = 3.14159;
		
	
		System.out.println("Digite o valor de A: ");
		A = input.nextFloat();
		System.out.println("Digite o valor de B: ");
		B = input.nextFloat();
		System.out.println("Digite o valor de C: ");
		C = input.nextFloat();
		
		
		triangulo = A * C / 2;
		area = Math.pow(C, 2) * pi;
		trapezio = (A + B) * C /2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		
		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + area);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);
		
		
	}

}
