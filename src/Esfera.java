import java.util.Scanner;

public class Esfera {
    private double radio;
    private double area;
    private double volumen;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        radio = scanner.nextDouble();
        area = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la esfera es: " + area);
    }

    public void calcularVolumen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        radio = scanner.nextDouble();
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }
}
