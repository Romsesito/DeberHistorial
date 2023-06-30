import java.util.Scanner;

public class Cubo {
    private double lado;
    private double area;
    private double volumen;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cubo: ");
        lado = scanner.nextDouble();
        area = 6 * lado * lado;
        System.out.println("El área del cubo es: " + area);
    }

    public void calcularVolumen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cubo: ");
        lado = scanner.nextDouble();
        volumen = lado * lado * lado;
        System.out.println("El volumen del cubo es: " + volumen);
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }
}
