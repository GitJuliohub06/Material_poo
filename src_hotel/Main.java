import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String cliente= "";
        String tipoHabitacion = "";
        String desayuno = "";
        int opc=0;

        System.out.println("BIENVENIDO AL HOTEL LA BENDICION DE DIOS");
        System.out.print("Ingrese su nombre: ");
        cliente = sc.nextLine();
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);


        do {
            System.out.println("----------MENU PRINCIPAL----------");
            System.out.print("Ingrese el tipo de habitacion (Sencilla $50.00, Doble $75.00, Suite $120.00): ");
            tipoHabitacion = sc.nextLine();
            System.out.print("Desea desayuno incluido ($+10.00) s/n: ");
            desayuno = sc.nextLine();

            Habitacion habitacion = new Habitacion();
            habitacion.CalcularPrecio(tipoHabitacion, desayuno);
            reserva.generarReserva(habitacion);
            reserva.mostrarReserva();

            System.out.println("1. Realizar otra Reserva");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            opc = sc.nextInt();
            sc.nextLine();






        }while(opc!=0);

    }
}