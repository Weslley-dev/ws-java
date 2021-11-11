package application;
import util.currencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class exercicioMetodos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        currencyConverter value = new currencyConverter();

        System.out.println("What is the dollar price?");
        double cotacao = input.nextDouble();
        System.out.println("How many dollars will be bought?");
        double valor = input.nextDouble();


        double rest1 = value.conversao(valor,cotacao);

         System.out.printf("Amount to be paid in reais = %.2f%n", rest1);

        input.close();
    }
}
