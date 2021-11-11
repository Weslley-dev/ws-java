import java.util.Locale;

public class Main {
	// anotações aula1 udemy - java.
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 30;
		double renda = 40000.00;
		int y = 22;
		double x = 10.242500000;
		System.out.println("Eai carai"); 
		// o println tem uma quebra de linha
		// o System.out.print não tem.
		System.out.println("Opa");
		System.out.println(y);
		System.out.println(x);
		// o printf é para imprimir formatado, limitando as casas decimais
		// a porcentagem %. serve para indicar quantas casas decimais ele vai ler
		// que nesse caso é 2. 
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		// configurar a localização do script, utilizando o ponto ao invés da virgula.
		System.out.println("RESULTADO " + x + " METROS");
		// concatenar
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	// os marcadores de variáveis, no caso o %s e os demais estão identificando 
	// as variaveis, como nome, idade e renda.
	}

}
