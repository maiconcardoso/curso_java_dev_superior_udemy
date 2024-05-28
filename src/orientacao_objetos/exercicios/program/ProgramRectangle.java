package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.Rectangle;

public class ProgramRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle with and height");
        rectangle.with = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

        input.close();
    }
}
