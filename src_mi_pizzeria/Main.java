import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int opc = 0;
        Scanner sc = new Scanner(System.in);
        String tipo = "";
        String tamanio = "";
        String ingrediente_extra_decision = "";
        boolean ingrediente_extra = false;
        int cantidad = 0;
        Pedido pedido = new Pedido();
        int nuevo_pedido = 0;


        System.out.println("\nBienvenido a la Pizzeria la bendicion de Dios");

        do {

            System.out.println("------------OPCIONES------------");
            System.out.println("1. Agregar pizza al pedido");
            System.out.println("2. Mostrar pedido");
            System.out.println("0. Salir");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Ingrese el tamanio (Personal, Grande o Gigante): ");
                    tamanio = sc.nextLine();
                    System.out.println("Ingrese el tipo (Clasica o Especialidad");
                    tipo = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Desea ingrediente extra s/n: ");
                    ingrediente_extra_decision = sc.nextLine();

                    Pizza pizza = new Pizza(tamanio, tipo, ingrediente_extra, 0.0 );
                    pizza.CalcularPrecio(tamanio, tipo, pizza.getPrecio());
                    pizza.CalcularIngredienteExtra(ingrediente_extra_decision);
                    System.out.println("Ingrese la cantidad a agregar al carrito: ");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    if (nuevo_pedido > 0) {
                        pedido.setTotal(0);
                    }
                    pedido.AdicionarPizza(pizza, cantidad);
                    nuevo_pedido++;

                    break;

                case 2:
                    pedido.ImprimirPedido();
                    break;

                case 0:
                    System.out.println("Muchas Gracias por su visita :D ");

                    break;

                    default:
                        System.out.println("Opcion no valida");
            }

        }while (opc != 0);
    }
}