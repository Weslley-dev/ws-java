import java.util.Locale;

public class atv1 {
	public static void main(String[] args) {
			
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.00;
		double price2 = 650.0;
		double measue = 53.234567;
				
		System.out.printf("Products: \n" + product1 + " which price is $ %.2f\n", price1);
		System.out.printf(product2 + ", which price is $ %.2f\n", price2);
		
		System.out.println("\nRecord:" + age + " years old, code " + code + " and gender: " + gender);
		
		System.out.printf("\nMeasue with eight decimal places: %f00", measue);
		
		System.out.printf("\nRouded (three decimal places): %.3f", measue);
		System.out.printf("\nUS decimal point: %.3f", measue);
		Locale.setDefault(Locale.US);
		
		
		
		
		
		
			
	
	}
}
