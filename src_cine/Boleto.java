public class Boleto {
    private String funcion; //2D, 3D, 4Dx
    private String cliente; //Adulto, Estudiante, Niño
    private boolean bebida = false; //incluye bebida ?
    private double precio; //precio base del boleto
    private double total; //precio total

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFuncion() {
        return funcion;
    }

    public void calcularPrecio(String funcion, String cliente, String bebida) {

        if (funcion.equalsIgnoreCase("2D")){
            precio = 5.00 ;
            total = precio;
        }else if (funcion.equalsIgnoreCase("3D")){
            precio = 7.50 ;
            total = precio;
        }else if (funcion.equalsIgnoreCase("4DX")){
            precio = 10.00 ;
            total = precio;
        }

        if (bebida.equalsIgnoreCase("s")) {
            this.bebida = true;
            total = total +2.00;
        }


        if (cliente.equalsIgnoreCase("Adulto")){
            return;
        }else if (cliente.equalsIgnoreCase("Estudiante")){
            total= total - total*0.1;
        }else if (cliente.equalsIgnoreCase("Nino")){
            total= total - total*0.2;
        }




    }


    public void mostrarBoleto() {
        System.out.println("----------DATOS DEL BOLETO---------");
        System.out.println("Funcion: " + funcion);
        System.out.println("Tipo de cliente: " + cliente);
        System.out.println("Inclute bebida: " + bebida);
        System.out.println("Precio base: " + precio);
        System.out.println("Total: " + total);

    }
}
