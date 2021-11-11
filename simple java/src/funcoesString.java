
public class funcoesString {

	public static void main(String[] args) {

		
		String original = "abcde FGHI ABC abc DEFG     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9); // aqui ele recorta 2 abaixo do caractere 9.
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original: - " + original + " - "); 
		System.out.println("toLowerCase: -" + s01 + " - "); // deixar todas as letras minusculas
		System.out.println("toUpperCase: -" + s02 + " - "); // deixar todas letras maiúsculas
		System.out.println("trim: -" + s03 + " - "); // cortar parágrafos
		System.out.println("substring(2): -" + s04 + " - "); 
		// recortar a string de acordo com a quantidade informada no argumento nesse caso foi 2. 
		System.out.println("substring(2,9): -" + s05 + " - ");
		System.out.println("replace('a', 'x'): -" + s06 + " - "); // serve para trocar algum caractere, nesse caso trocou o a por x 
		System.out.println("replace('abc', 'xy'): -" + s07+ " - "); // trocou abc por xy
		System.out.println("Index Of bc: " + i);
		System.out.println("Last IndexOf bc: " + j);
		
		
		
		
	}

}
