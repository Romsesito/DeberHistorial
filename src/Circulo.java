import java.util.Scanner;

public class Circulo {
    private double radio;
    private double area;
    private double perimetro;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = scanner.nextDouble();
        area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        radio = scanner.nextDouble();
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
