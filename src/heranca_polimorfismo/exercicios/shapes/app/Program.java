package heranca_polimorfismo.exercicios.shapes.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.exercicios.shapes.entities.Circle;
import heranca_polimorfismo.exercicios.shapes.entities.Rectangle;
import heranca_polimorfismo.exercicios.shapes.entities.Shape;
import heranca_polimorfismo.exercicios.shapes.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = input.nextInt();

        for (int i=0; i<number; i++) {
            System.out.println("Shape #" + (i+1) + " data: ");
            System.out.print("Rectagle or Circle? (r/c): ");
            Character response = input.next().charAt(0);
            System.out.print("Color: (BLACK /  BLUE / RED): ");
            Color color = Color.valueOf(input.next()); 

            if (response == 'r') {
                System.out.print("With: ");
                double with = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                Rectangle rectangle = new Rectangle(color, with, height);
                list.add(rectangle);
            } else {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                Circle circle = new Circle(color, radius);
                list.add(circle);
            }
        }
        
        System.out.println();
        System.out.println("Shapes Areas ");
        for (Shape s: list) {
            System.out.printf("%.2f%n" , s.area());
        }

        input.close();
        
    }
}
