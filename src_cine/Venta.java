public class Venta {
    private String nombre; //nombre del comprador
    private int n_venta; //codigo aleatorio de venta
    private Boleto boleto;

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void generarVenta(Boleto boleto) {
        this.boleto = boleto;
        n_venta = (int)(Math.random() * 100)+1;
    }

    void MostrarResumenVenta() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Numero de venta: " + n_venta);
        boleto.mostrarBoleto();
    }
}
