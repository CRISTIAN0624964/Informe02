import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 8) {
                salir = true;  // Se cambia salir a true para terminar el bucle
                System.out.println("Programa finalizado.");
                break;  // Salir del bucle
            }

            System.out.print("Seleccione el tipo de dato (1 para Integer, 2 para Double): ");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.print("Ingrese un valor entero: ");
                int valor1 = sc.nextInt();
                OperacionesMatInteger op1 = new OperacionesMatInteger(valor1);

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese otro valor entero: ");
                        int suma2 = sc.nextInt();
                        System.out.println("Resultado: " + op1.suma(suma2));
                        break;
                    case 2:
                        System.out.print("Ingrese otro valor entero: ");
                        int resta2 = sc.nextInt();
                        System.out.println("Resultado: " + op1.resta(resta2));
                        break;
                    case 3:
                        System.out.print("Ingrese otro valor entero: ");
                        int producto2 = sc.nextInt();
                        System.out.println("Resultado: " + op1.producto(producto2));
                        break;
                    case 4:
                        System.out.print("Ingrese otro valor entero: ");
                        int division2 = sc.nextInt();
                        try {
                            System.out.println("Resultado: " + op1.division(division2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el exponente: ");
                        int exponente = sc.nextInt();
                        System.out.println("Resultado: " + Math.pow(valor1, exponente));
                        break;
                    case 6:
                        System.out.println("Raíz Cuadrada: " + Math.sqrt(valor1));
                        break;
                    case 7:
                        System.out.println("Raíz Cúbica: " + Math.cbrt(valor1));
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } else if (tipo == 2) {
                System.out.print("Ingrese un valor decimal (double): ");
                double valor1 = sc.nextDouble();
                OperacionesMatDouble op1 = new OperacionesMatDouble(valor1);

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese otro valor decimal: ");
                        double suma2 = sc.nextDouble();
                        System.out.println("Resultado: " + op1.suma(suma2));
                        break;
                    case 2:
                        System.out.print("Ingrese otro valor decimal: ");
                        double resta2 = sc.nextDouble();
                        System.out.println("Resultado: " + op1.resta(resta2));
                        break;
                    case 3:
                        System.out.print("Ingrese otro valor decimal: ");
                        double producto2 = sc.nextDouble();
                        System.out.println("Resultado: " + op1.producto(producto2));
                        break;
                    case 4:
                        System.out.print("Ingrese otro valor decimal: ");
                        double division2 = sc.nextDouble();
                        try {
                            System.out.println("Resultado: " + op1.division(division2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el exponente: ");
                        double exponente = sc.nextDouble();
                        System.out.println("Resultado: " + Math.pow(valor1, exponente));
                        break;
                    case 6:
                        System.out.println("Raíz Cuadrada: " + Math.sqrt(valor1));
                        break;
                    case 7:
                        System.out.println("Raíz Cúbica: " + Math.cbrt(valor1));
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
