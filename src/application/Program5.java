package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Student aluno = new Student();

        System.out.println("Digite o seu nome: ");
        aluno.name = input.nextLine();

        System.out.println("Digite o valor da grade1: ");
        aluno.grade1 = input.nextDouble();

        System.out.println("Digite o valor da grade2: ");
        aluno.grade2 = input.nextDouble();

        System.out.println("Digite o valor da grade3: ");
        aluno.grade3 = input.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());
        if (aluno.finalGrade() < 60.00) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        } else {
            System.out.println("PASS");
        }
        input.close();
    }
}
