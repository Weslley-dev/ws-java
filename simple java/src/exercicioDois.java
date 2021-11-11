import java.util.Scanner;
public class exercicioDois {

	public static void main(String[] args) {
		
			
		Scanner input = new Scanner (System.in);
		
		double area, pi,raio;
		
		System.out.println("Digite o valor do raio: ");
		raio = input.nextDouble();
		
		pi = 3.14159;
		
		area = pi * Math.pow(raio, 2);
		
		System.out.println("Raio: " + area);
		
		
	}

}
