import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int n_pizza = 0;
        Pedido pedido_nuevo = new Pedido();
        int contador = 0;

        do {
            System.out.println("--MENU--");
            System.out.println("1. Realizar un pedido \n2. Ver pedido \n3.Salir ");
            System.out.println("Ingrese la opción que desea realizar: ");
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("--Realizar pedido--");
                        System.out.println("Cuantas pizzas desea ordenar: ");
                        n_pizza = sc.nextInt();
                        sc.nextLine(); //Buffer

                        //pedido_nuevo.setCantidad(n_pizza);

                        //double precio_final_pedido = 0.0;

                        for (int i = 0; i < n_pizza; i++) {
                            System.out.println("Pizza #" + (i + 1) + ": ");

                            String size = "";
                            while (true) {
                                System.out.println("Tamaño - Personal / Grande / Gigante: ");
                                size = sc.nextLine();
                                if (size.equalsIgnoreCase("Personal") || size.equalsIgnoreCase("personal") || size.equalsIgnoreCase("Grande") || size.equalsIgnoreCase("grande") || size.equalsIgnoreCase("Gigante") || size.equalsIgnoreCase("gigante")) {
                                    break;
                                } else {
                                    System.out.println("Tamaño inválido. Intente nuevamente");
                                }
                            }

                            String tipo = "";
                            while (true) {
                                System.out.println("Tipo - Un ingrediente / Especialidad: ");
                                tipo = sc.nextLine();
                                if (tipo.equalsIgnoreCase("Un ingrediente") || tipo.equalsIgnoreCase("un ingrediente") || tipo.equalsIgnoreCase("Especialidad") || tipo.equalsIgnoreCase("especialidad")) {
                                    break;
                                } else {
                                    System.out.println("Tipo inválido. Ingrese Intente nuevamente");
                                }
                            }

                            String ing_ex = "";
                            boolean ingrediente_extra = false;
                            while (true) {
                                System.out.println("¿Desea un ingrediente extra? Si / No");
                                ing_ex = sc.nextLine();
                                if (ing_ex.equalsIgnoreCase("si")||ing_ex.equalsIgnoreCase("Si")) {
                                    ingrediente_extra = true;
                                    break;
                                } else if (ing_ex.equalsIgnoreCase("no")||ing_ex.equalsIgnoreCase("No")) {
                                    ingrediente_extra = false;
                                    break;
                                } else {
                                    System.out.println("Opción inválida. Escriba 'Si' o 'No'.");
                                }
                            }


                            Pizza nuevaPizza = new Pizza();
                            nuevaPizza.Setsize(size);
                            nuevaPizza.Settipo(tipo);
                            nuevaPizza.Setingrediente_extra(ingrediente_extra);

                            /*double precioBase = nuevaPizza.calcularPrecio_Base(size, tipo);
                            nuevaPizza.Setprecio(precioBase);

                            double precioFinal = nuevaPizza.calcularIngrediente_Extra(ingrediente_extra);
                            nuevaPizza.Setprecio_final(precioFinal);


                            nuevaPizza.calcularPrecio_Base(size, tipo); // Esto ya asigna el precio base internamente
                            nuevaPizza.calcularIngrediente_Extra(ingrediente_extra); // Esto actualiza el precio final correctamente
                            */

                            nuevaPizza.calcularPrecio_Base();
                            pedido_nuevo.agregarPizzas(nuevaPizza);
                            System.out.println("Pizza agregada correctamente.\n");
                            contador++;
                        }
                        //pedido_nuevo.setTotal(precio_final_pedido);
                        break;


                    case 2:
                        if (pedido_nuevo.getPizzas_pedido().isEmpty()) {
                            System.out.println("Aún no se ha ordenado algun pedido");
                        } else {
                            System.out.println("-- Pedidos --");
                            pedido_nuevo.imprimir_Pedido(contador);

                            for (int i = 0; i < pedido_nuevo.getPizzas_pedido().size(); i++) {
                                System.out.println("Pizza #" + (i + 1));
                                pedido_nuevo.getPizzas_pedido().get(i).mostrarPizza();
                                System.out.println();
                            }
                            System.out.println("-----------------------------------------------------\n");
                        }
                        break;

                    case 3:
                        System.out.println(" Saliendo del programa........");
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
                }

                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Ingrese una opción valida.");
                sc.nextLine();
            }

        } while (opcion != 3);
    }
}