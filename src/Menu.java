import java.util.Scanner;

public class Menu implements Interfaz {
    private Scanner scanner;
    private Cuadrado cuadrado;
    private Triangulo triangulo;
    private Circulo circulo;
    private Cubo cubo;
    private Piramide piramide;
    private Esfera esfera;

    public Menu() {
        scanner = new Scanner(System.in);
        cuadrado = new Cuadrado();
        triangulo = new Triangulo();
        circulo = new Circulo();
        cubo = new Cubo();
        piramide = new Piramide();
        esfera = new Esfera();
    }

    public void mostrarMenu() {
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Figuras 2D");
            System.out.println("2. Figuras 3D");
            System.out.println("3. Historial de figuras");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuFiguras2D();
                    break;
                case 2:
                    mostrarMenuFiguras3D();
                    break;
                case 3:
                    mostrarHistorial();
                    break;
                case 4:
                    ejecutando = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void mostrarMenuFiguras2D() {
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("FIGURAS 2D");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Volver");
            System.out.print("Seleccione una figura: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuOperaciones("Cuadrado");
                    break;
                case 2:
                    mostrarMenuOperaciones("Triángulo");
                    break;
                case 3:
                    mostrarMenuOperaciones("Círculo");
                    break;
                case 4:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void mostrarMenuFiguras3D() {
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("FIGURAS 3D");
            System.out.println("1. Cubo");
            System.out.println("2. Pirámide");
            System.out.println("3. Esfera");
            System.out.println("4. Volver");
            System.out.print("Seleccione una figura: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuOperaciones("Cubo");
                    break;
                case 2:
                    mostrarMenuOperaciones("Pirámide");
                    break;
                case 3:
                    mostrarMenuOperaciones("Esfera");
                    break;
                case 4:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void mostrarMenuOperaciones(String figura) {
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("OPERACIONES");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Volver");
            System.out.print("Seleccione una operación: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (figura.equals("Cuadrado")) {
                        cuadrado.calcularArea();
                    } else if (figura.equals("Triángulo")) {
                        triangulo.calcularArea();
                    } else if (figura.equals("Círculo")) {
                        circulo.calcularArea();
                    } else if (figura.equals("Cubo")) {
                        cubo.calcularArea();
                    } else if (figura.equals("Pirámide")) {
                        piramide.calcularArea();
                    } else if (figura.equals("Esfera")) {
                        esfera.calcularArea();
                    }
                    break;
                case 2:
                    if (figura.equals("Cuadrado")) {
                        cuadrado.calcularPerimetro();
                    } else if (figura.equals("Triángulo")) {
                        triangulo.calcularPerimetro();
                    } else if (figura.equals("Círculo")) {
                        circulo.calcularPerimetro();
                    } else if (figura.equals("Cubo")) {
                        cubo.calcularVolumen();
                    } else if (figura.equals("Pirámide")) {
                        piramide.calcularVolumen();
                    } else if (figura.equals("Esfera")) {
                        esfera.calcularVolumen();
                    }
                    break;
                case 3:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void mostrarHistorial() {
        System.out.println("HISTORIAL DE FIGURAS");
        System.out.println("Cuadrado: Área = " + cuadrado.getArea());
        System.out.println("Triángulo: Área = " + triangulo.getArea());
        System.out.println("Círculo: Área = " + circulo.getArea());
        System.out.println("Cuadrado: Perímetro = " + cuadrado.getPerimetro());
        System.out.println("Triángulo: Perímetro = " + triangulo.getPerimetro());
        System.out.println("Círculo: Perímetro = " + circulo.getPerimetro());
        System.out.println("Cubo: Volumen = " + cubo.getVolumen());
        System.out.println("Pirámide: Volumen = " + piramide.getVolumen());
        System.out.println("Esfera: Volumen = " + esfera.getVolumen());
    }
}
