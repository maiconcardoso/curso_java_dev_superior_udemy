package orientacao_objetos.exercicios.entities;

public class Rectangle {
    public double with;
    public double height;

    public double area() {
        return this.with * this.height;
    }

    public double perimeter() {
        return this.with*2 + this.height*2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(with, 2) + Math.pow(height, 2));
    }
}
