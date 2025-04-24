public class Reserva {
    private int numeroReserva; //aleatorio
    private String cliente;
    private Habitacion habitacion;

    public int getNumeroReserva() {
        return numeroReserva;
    }
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }


    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public Habitacion getHabitacion() {
        return habitacion;
    }

    void generarReserva(Habitacion habitacion) {
    numeroReserva = (int) (Math.random() * 100) + 1;
    this.habitacion = habitacion;
    }

    void mostrarReserva() {
        System.out.println("----------DATOS DE SU RESERVA----------");
        System.out.println("Numero de reserva: " + numeroReserva);
        System.out.println("Cliente: " + cliente);
        habitacion.MostrarHabitacion();
    }


}
