package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos_v2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        input.close();

    }
}
