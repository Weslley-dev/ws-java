package entities; // pacote da classe

public class Triangle { // nome da classe
	/*
	 Lembrando:
	 O Public � relacionado ao tipo q o atributo pode ser acessado, se fosse private s� poderia 
	 ser chamado se fosse mencionado, o public qualquer programa pode chamar essa classe.
	 */
	
	public double a; // atributos/objetos da classe 
	public double b; // atributos/objetos da classe
	public double c; // atributos/objetos da classe
	
	
	public double area() { // tipo de dado que o m�todo retorna, se o m�todo n retornasse nada teriq que usar void
		// esse m�todo �rea est� vazio porque os par�metros j� foram definidos na classe, double a,b,c.
		double p = (a+b+c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		// criei uma fun��o area, para ser usada no program
		
	}
	
}
