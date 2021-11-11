package application;
import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee(); // estou chamando a classe Employee e criando o objeto emp para utilizar os dados da classe

        System.out.print("Name: ");
        emp.name = input.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        emp.tax = input.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + emp);

        input.close();
    }
}
