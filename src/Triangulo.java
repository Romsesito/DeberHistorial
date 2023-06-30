import java.util.Scanner;

public class Triangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = scanner.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();
        perimetro = lado1 + lado2 + lado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
