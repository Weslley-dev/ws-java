import java.util.Scanner;

public class quebraDeLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String s1,s2,s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine(); // ler a linha inteira
			
		sc.close();
		
		// O nextline serve para ler o texto at� a quebra de linha
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
