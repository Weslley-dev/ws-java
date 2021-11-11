package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantify;

	public Product(String name, double price, int quantify){ //CONSTRUTOR
		this.name = name; // o this é uma forma de diferenciar o parametro do construtor e o atributo do objeto
		this.price = price;
		this.quantify = quantify;
	}

	public double totalValueInStock() {
		return price * quantify;
	}
	public void addProducts(int quantify) {
		this.quantify += quantify; // no this.quantify eu to acessando o atributo da classe e não o parâmetro e só depois o parâmetro.
		/*
		 Como tem uma ambiguidade no codigo quantify no parâmetro e quantify no atributo, o this tem q ser utilizado.
		*/
	}
	public void removeProducts(int quantify) {
		this.quantify -= quantify;
	}
	
	public String toString() { // criei o método toString para chamar o atributo name da classe
		return name
		 + ", $ "
		 + String.format("%.2f", price) // como não tá mostrando os zeros certos, adicionei o format para converter em String
		 + ", $ "
		 + quantify
		 + " units, Total: $ "
		 + String.format("%.2f", totalValueInStock()); // aqui também
		 
	}
	
}
/*
 
 o object tem alguns métodos interessantes:
 
 getClass > retorna o tipo do objeto
 equals > compara se o objeto é igual a outro
 hashCode > retorna um codigo hash do objeto
 toString > converte o objeto para string
 
 
 */
	
