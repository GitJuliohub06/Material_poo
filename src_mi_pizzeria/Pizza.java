public class Pizza {
private String tamanio;
private String tipo;
private Boolean ingrediente_extra;
private double precio;
private double precio_total;


public Pizza (){}
public Pizza(String tamanio, String tipo, Boolean ingrediente_extra, double precio) {
this.tamanio = tamanio;
this.tipo = tipo;
this.ingrediente_extra = ingrediente_extra;
this.precio = precio;
}

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getIngrediente_extra() {
        return ingrediente_extra;
    }

    public void setIngrediente_extra(Boolean ingrediente_extra) {
        this.ingrediente_extra = ingrediente_extra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }



//Mostrar Pizza

    public void mostrarPizza() {
    System.out.println("Tipo: " + tipo);
    System.out.println("Tamanio: " + tamanio);
    System.out.println("Ingrediente_extra: " + ingrediente_extra);
    System.out.println("Precio base: " + precio);
    System.out.println("Precio_total: " + precio_total);

    }


//Calcular Ingrediente extra

    public void CalcularIngredienteExtra(String ingrediente) {
    if (ingrediente.equalsIgnoreCase("s")) {
        precio_total = precio_total + 1.99;
        ingrediente_extra = true;
    }
    else {
        return;
    }
    }

//Calcular_precio_base

    public void CalcularPrecio(String tamanio, String tipo, double precio) {

    if (tamanio.equalsIgnoreCase("Personal")) {
        if (tipo.equalsIgnoreCase("Clasica")) {
            precio_total = precio + 4.99;
        }
        else if (tipo.equalsIgnoreCase("Especialidad")) {
            precio_total = precio + 5.99;
        }
    }

    else if (tamanio.equalsIgnoreCase("Grande")) {
        if (tipo.equalsIgnoreCase("Clasica")) {
            precio_total = precio + 6.99;
        }
        else if (tipo.equalsIgnoreCase("Especialidad")) {
            precio_total = precio + 7.99;
        }

    }
    else if (tamanio.equalsIgnoreCase("Gigante")) {
        if (tipo.equalsIgnoreCase("Clasica")) {
            precio_total = precio + 8.99;
        }
        else if (tipo.equalsIgnoreCase("Especialidad")) {
            precio_total = precio + 9.99;
        }
    }

    }

}
