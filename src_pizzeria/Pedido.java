import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Pedido {
    public static Scanner sc = new Scanner(System.in);
    Random n_rand_pedido = new Random();

    private int n_pedido = 0;
    private LocalDate fecha;
    private String estado = "";
    private int cantidad = 0;
    private double total = 0.0;
    private ArrayList<Pizza> pizzas_pedido;

    //constructor vacio
    public Pedido(){
        this.pizzas_pedido = new ArrayList<>();
    }

    //constructor parametizado
    public Pedido(int n_pedido, LocalDate fecha, String estado, int cantidad, double total, ArrayList<Pizza> pizzas_pedido) {
        this.n_pedido = n_pedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cantidad = cantidad;
        this.total = total;
        this.pizzas_pedido = new ArrayList<>();
    }


    public void setN_pedido(int n_pedido) {
        this.n_pedido = n_pedido;
    }
    public int getN_pedido() {
        return n_pedido;
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

    public ArrayList<Pizza> getPizzas_pedido() {
        return pizzas_pedido;
    }
    public void setPizzas_pedido(ArrayList<Pizza> pizzas_pedido) {
        this.pizzas_pedido = pizzas_pedido;
    }


    public void agregarPizzas(Pizza pizza){
        pizzas_pedido.add(pizza);
        total += pizza.Getprecio_final();
    }

    public ArrayList<Pizza> obtenerPizzas(){
        return pizzas_pedido;
    }


    public void imprimir_Pedido(int n_cantidad) {
        n_pedido = n_rand_pedido.nextInt(50);
        cantidad = n_cantidad;
        fecha = LocalDate.now();
        System.out.println("N° Pedido: " + n_pedido + " - Estado:"  + estado + " - Cantidad:" + cantidad + " - Total de orden: " + total + " Fecha: " + fecha);

    }

}
