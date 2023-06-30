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
            System.out.println("============================");
            System.out.println("============================");
            System.out.println("MENU PRINCIPAL");
            System.out.println("============================");
            System.out.println("1. Figuras 2D");
            System.out.println();
            System.out.println("2. Figuras 3D");
            System.out.println();
            System.out.println("3. Historial de figuras");
            System.out.println();
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("============================");
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
                    System.out.println("Finalizando...");
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
            System.out.println("============================");
            System.out.println("Figuras 2D");
            System.out.println("============================");
            System.out.println();
            System.out.println("1. Cuadrado");
            System.out.println();
            System.out.println("2. Triángulo");
            System.out.println();
            System.out.println("3. Círculo");
            System.out.println();
            System.out.println("4. Volver");
            System.out.println("============================");
            System.out.println("============================");
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
            System.out.println("============================");
            System.out.println("FIGURAS 3D");
            System.out.println("============================");
            System.out.println();
            System.out.println("1. Cubo");
            System.out.println();
            System.out.println("2. Pirámide");
            System.out.println();
            System.out.println("3. Esfera");
            System.out.println();
            System.out.println("4. Volver");
            System.out.println();
            System.out.println("============================");
            System.out.print("Seleccione una figura: ");
            System.out.println("============================");
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
            System.out.println("============================");
            System.out.println("OPERACIONES");
            System.out.println("============================");
            System.out.println();
            System.out.println("1. Calcular área");
            System.out.println();
            System.out.println("2. Calcular perímetro");
            System.out.println();
            System.out.println("3. Volver");
            System.out.println();
            System.out.println("============================");
            System.out.print("Seleccione una operación: ");
            System.out.println("============================");
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
        System.out.println("============================");
        System.out.println("HISTORIAL DE FIGURAS");
        System.out.println("============================");
        System.out.println("C U A D R A D O");
        System.out.println("============================");
        System.out.println(" Área = " + cuadrado.getArea());
        System.out.println(" Perímetro = " + cuadrado.getPerimetro());
        System.out.println("============================");
        System.out.println(" T R I A N G U L O");
        System.out.println("============================");
        System.out.println(" Área = " + triangulo.getArea());
        System.out.println(" Perímetro = " + triangulo.getPerimetro());
        System.out.println("============================");
        System.out.println(" C I R C U L O");
        System.out.println("============================");
        System.out.println("Área = " + circulo.getArea());
        System.out.println("Perímetro = " + circulo.getPerimetro());
        System.out.println("============================");
        System.out.println(" C U B O ");
        System.out.println("============================");
        System.out.println("Area = "+cubo.getArea());
        System.out.println("Volumen = " + cubo.getVolumen());
        System.out.println("============================");
        System.out.println("P I R A M I D E");
        System.out.println("============================");
        System.out.println("Area = "+ piramide.getAreaTotal());
        System.out.println("Volumen = " + piramide.getVolumen());
        System.out.println("============================");
        System.out.println("E S F E R A");
        System.out.println("============================");
        System.out.println("Area ="+ esfera.getArea());
        System.out.println("Esfera: Volumen = " + esfera.getVolumen());
        System.out.println("============================");
    }
}
