import java.util.Scanner;

public class Piramide {
    private double base;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volumen;

    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base de la pirámide: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        altura = scanner.nextDouble();
        areaBase = base * base;
        areaLateral = base * Math.sqrt((base * base) / 4 + altura * altura);
        areaTotal = areaBase + areaLateral;
        System.out.println("El área total de la pirámide es: " + areaTotal);
    }

    public void calcularVolumen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base de la pirámide: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        altura = scanner.nextDouble();
        volumen = (base * base * altura) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getVolumen() {
        return volumen;
    }
}
