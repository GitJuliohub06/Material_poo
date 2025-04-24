public class Habitacion {
    private String tipo; //Sencilla, doble, suite
    private boolean desayuno = false; //Si incluye desayuno
    private double precio; //Precio base según el tipo
    private double total; //Precio base + desayuno

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public boolean isDesayuno() {
        return desayuno;
    }
    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }


    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }





    void CalcularPrecio(String tipo, String desayuno) {

        if(desayuno.equalsIgnoreCase("s")){
            this.desayuno = true;
        }

        if (tipo.equalsIgnoreCase("Sencilla")) {
            precio = 50;
            total = precio ;
            this.tipo = "Sencilla";
            if (this.desayuno) {
                total = precio +10;
            }


        }
        else if (tipo.equalsIgnoreCase("Doble")) {
            precio = 75;
            total = precio ;
            this.tipo = "Doble";

            if (this.desayuno) {
                total = precio +10;
            }

        }
        else if (tipo.equalsIgnoreCase("Suite")) {
            precio = 120;
            total = precio;
            this.tipo = "Suite";
            if (this.desayuno) {
                total = precio +10;
            }

        }
    }
    void MostrarHabitacion() {
        System.out.println("----------Datos de su Habitación----------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Desayuno: " + desayuno);
        System.out.println("Precio base: " + precio);
        System.out.println("Total: " + total);
    }

}
