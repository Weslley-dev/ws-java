package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = input.nextLine(); // desse jeito aqui eu faço a leitura do nome e guardo na classe product
		System.out.print("Price: ");
		double price = input.nextDouble(); // aqui também
		System.out.println("Quantify in stock: ");
		int quantity = input.nextInt();

		Product product = new Product(name, price, quantity); // instanciando os valores
		//

		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = input.nextInt();
		product.addProducts(quantity); // faz a atualização da quantidade no objeto product
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// System.out.println(product.name + "," + product.price + "," + product.quantify);
		
		 //System.out.println(product.toString()); // aqui eu estou pedindo para chamar o método toString e consequentemente o name
		// outra coisa, não é necessário colocar o .toString, posso simplesmente colocar System.out.println(product); que irá sair o name.
		
		System.out.println();
		System.out.println("Enter the number of removed to be added in stock: ");
		quantity = input.nextInt();
		product.removeProducts(quantity); // aqui é para remover uma quantidade do objeto product
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		input.close();
	}

}
