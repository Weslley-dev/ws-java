package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantify;

	public Product(String name, double price, int quantify){ //CONSTRUTOR
		this.name = name; // o this � uma forma de diferenciar o parametro do construtor e o atributo do objeto
		this.price = price;
		this.quantify = quantify;
	}

	public double totalValueInStock() {
		return price * quantify;
	}
	public void addProducts(int quantify) {
		this.quantify += quantify; // no this.quantify eu to acessando o atributo da classe e n�o o par�metro e s� depois o par�metro.
		/*
		 Como tem uma ambiguidade no codigo quantify no par�metro e quantify no atributo, o this tem q ser utilizado.
		*/
	}
	public void removeProducts(int quantify) {
		this.quantify -= quantify;
	}
	
	public String toString() { // criei o m�todo toString para chamar o atributo name da classe
		return name
		 + ", $ "
		 + String.format("%.2f", price) // como n�o t� mostrando os zeros certos, adicionei o format para converter em String
		 + ", $ "
		 + quantify
		 + " units, Total: $ "
		 + String.format("%.2f", totalValueInStock()); // aqui tamb�m
		 
	}
	
}
/*
 
 o object tem alguns m�todos interessantes:
 
 getClass > retorna o tipo do objeto
 equals > compara se o objeto � igual a outro
 hashCode > retorna um codigo hash do objeto
 toString > converte o objeto para string
 
 
 */
	
