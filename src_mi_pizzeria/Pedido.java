import java.time.LocalDate;
import java.util.Scanner;


public class Pedido {
 public static Scanner sc = new Scanner(System.in);

 private int n_pedido;
 private LocalDate fecha;
 private String estado;
 private int cantidad;
 private double total;
 private Pizza pizza = new Pizza();

 public Pedido() {}

    public Pedido(int n_pedido, LocalDate fecha, String estado, int cantidad, double total, Pizza pizza) {
        this.n_pedido = n_pedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cantidad = cantidad;
        this.total = total;
        this.pizza = pizza;
    }

    public int getN_pedido() {
        return n_pedido;
    }

    public void setN_pedido(int n_pedido) {
        this.n_pedido = n_pedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

 public void AdicionarPizza(Pizza pizza, int cantidad) {
     total = total + cantidad* pizza.getPrecio_total();
     this.pizza = pizza;
     this.cantidad = cantidad;
 }

 public void ImprimirPedido() {
     fecha = LocalDate.now();
     n_pedido = (int)(Math.random()*100 ) + 1;

 System.out.println("\nNumero de pedido: " + n_pedido);
 System.out.println("Fecha: " + fecha);
 System.out.println("Estado: " + estado);
 System.out.println("Pizza: " + pizza.getTipo() + " - Cantidad: " + cantidad +" " + pizza.getTamanio() + " - Ingrediente extra: " + pizza.getIngrediente_extra() + " - Precio: " + pizza.getPrecio_total());
 System.out.println("Total: " + total);
 System.out.println("Muchas Gracias por su visita :D");
 }

}
