import java.util.Scanner;

public class Cuadrado {
    private double lado;
    private double area;
    private double perimetro;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = scanner.nextDouble();
        area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = scanner.nextDouble();
        perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
