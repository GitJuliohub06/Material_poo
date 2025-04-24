import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion_menu = 1;

        do {
            int opcion_venta = 0;
            String incluye_bebida = "";
            Venta venta = new Venta();
            Boleto boleto = new Boleto();

            System.out.println("---Bienvenido al cine la bendición de Dios---");

            // Entrada nombre
            System.out.print("Ingrese su nombre: ");
            venta.setNombre(sc.nextLine());

            // Tipo de función
            while (true) {
                try {
                    System.out.println("Tipo de funciones:\n1. 2D\n2. 3D\n3. 4DX");
                    System.out.print("Ingrese el número del tipo de función que desea: ");
                    opcion_venta = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    if (opcion_venta == 1) boleto.setFuncion("2D");
                    else if (opcion_venta == 2) boleto.setFuncion("3D");
                    else if (opcion_venta == 3) boleto.setFuncion("4DX");
                    else {
                        System.out.println("Opción no válida.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Error: Ingrese solo números.");
                    sc.nextLine(); // limpiar el buffer tras el error
                }
            }

            // Tipo de cliente
            while (true) {
                try {
                    System.out.println("Tipo de clientes:\n1. Adulto\n2. Estudiante\n3. Niño");
                    System.out.print("Ingrese el número del tipo de cliente: ");
                    opcion_venta = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    if (opcion_venta == 1) boleto.setCliente("Adulto");
                    else if (opcion_venta == 2) boleto.setCliente("Estudiante");
                    else if (opcion_venta == 3) boleto.setCliente("Niño");
                    else {
                        System.out.println("Opción no válida.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Error: Ingrese solo números.");
                    sc.nextLine(); // limpiar buffer
                }
            }

            // Bebida
            while (true) {
                System.out.print("¿Desea bebida incluida (+$2.00)? (s/n): ");
                incluye_bebida = sc.nextLine();
                if (incluye_bebida.equalsIgnoreCase("s") || incluye_bebida.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Opción inválida. Ingrese 's' o 'n'.");
                }
            }

            // Calcular precio y mostrar resumen
            boleto.calcularPrecio(boleto.getFuncion(), boleto.getCliente(), incluye_bebida);
            venta.generarVenta(boleto);

            System.out.println("----------DATOS DE SU COMPRA----------");
            venta.MostrarResumenVenta();

            // Preguntar si desea comprar otra vez
            while (true) {
                try {
                    System.out.print("¿Desea realizar otra compra? (1 = Sí, 0 = No): ");
                    opcion_menu = sc.nextInt();
                    sc.nextLine();
                    if (opcion_menu == 1 || opcion_menu == 0) break;
                    else System.out.println("Opción inválida.");
                } catch (Exception e) {
                    System.out.println("Ingrese un número válido.");
                    sc.nextLine();
                }
            }

        } while (opcion_menu != 0);




    }





}