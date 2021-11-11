package entities; // pacote da classe

public class Triangle { // nome da classe
	/*
	 Lembrando:
	 O Public é relacionado ao tipo q o atributo pode ser acessado, se fosse private só poderia 
	 ser chamado se fosse mencionado, o public qualquer programa pode chamar essa classe.
	 */
	
	public double a; // atributos/objetos da classe 
	public double b; // atributos/objetos da classe
	public double c; // atributos/objetos da classe
	
	
	public double area() { // tipo de dado que o método retorna, se o método n retornasse nada teriq que usar void
		// esse método área está vazio porque os parâmetros já foram definidos na classe, double a,b,c.
		double p = (a+b+c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		// criei uma função area, para ser usada no program
		
	}
	
}
