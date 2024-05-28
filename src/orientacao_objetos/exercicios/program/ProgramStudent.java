package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.Student;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        student.name = input.nextLine();
        student.grade1 = input.nextDouble();
        student.grade2 = input.nextDouble();
        student.grade3 = input.nextDouble();

        System.out.printf("Final Grade %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILD");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        input.close();
    }
}   
