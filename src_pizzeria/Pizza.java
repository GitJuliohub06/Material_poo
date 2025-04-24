import java.util.Objects;

public class Pizza {

    private String size; // personal, grande y gigante
    private String tipo; //especialidad
    private boolean ingrediente_extra = false; //
    private double precio;
    private double precio_final;

    //constructor vacío
    public Pizza() {
    }

    //constructor parametizado
    public Pizza(String size, String tipo, boolean ingrediente_extra, double precio, double precio_final) {
        this.size = size;
        this.tipo = tipo;
        this.ingrediente_extra = ingrediente_extra;
        this.precio = precio;
    }


    //getter y setter
    public void Setsize(String size) {
        this.size = size;
    }

    public String Getsize() {
        return this.size;
    }

    public void Settipo(String tipo) {
        this.tipo = tipo;
    }

    public String Gettipo() {
        return this.tipo;
    }

    public void Setingrediente_extra(boolean ingrediente_extra) {
        this.ingrediente_extra = ingrediente_extra;
    }

    public boolean Getingrediente_extra() {
        return this.ingrediente_extra;
    }

    public void Setprecio(double precio) {
        this.precio = precio;
    }

    public double Getprecio() {
        return this.precio;
    }

    public void Setprecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public double Getprecio_final() {
        return this.precio_final;
    }

//METODOS

    public void mostrarPizza() {

        String extra_ix = ingrediente_extra ? "Si" : "No";
        System.out.println("   Tamaño: " + size + " - Tipo: " + tipo + " - Ingrediente Extra: " + ingrediente_extra + " - Precio base: " + precio + " - Precio final: " + precio_final);
    }

    public double calcularIngrediente_Extra(boolean ingrediente_extra) {
        if (ingrediente_extra) {
            precio_final = precio + 1.99;
            return precio_final;
        } else if (ingrediente_extra== false) {
            precio_final = precio;
            return precio_final;
        } else return 0;
    }

    public void calcularPrecio_Base() {

        /*switch (size) {
            case "Personal":
                if (tipo.equals("Un ingrediente")) {
                    precio = 4.99;

                } else if (tipo.equals("Especialidad")) {
                    precio = 7.99;

                }
                break;

            case "Grande":
                if (tipo.equals("Un Ingrediente")) {
                    precio = 9.99;
                } else if  (tipo.equals("Especialidad")) {
                    precio = 11.99;
                }
                break;

            case "Gigante":
                if (tipo.equals("Un ingrediente")) {
                    precio = 12.99;
                } else if  (tipo.equals("Especialidad")) {
                    precio = 14.99;
                }

        }
        return precio;
    }

         */

        if (size.equalsIgnoreCase("Personal")) {
            if (tipo.equalsIgnoreCase("Un ingrediente")) {
                precio = 4.99;
            } else if (tipo.equalsIgnoreCase("Especialidad")) {
                precio = 7.99;
            }
        } else if (size.equalsIgnoreCase("Grande")) {
            if (tipo.equalsIgnoreCase("Un ingrediente")) {
                precio = 9.99;
            } else if (tipo.equalsIgnoreCase("Especialidad")) {
                precio = 11.99;
            }
        } else if (size.equalsIgnoreCase("Gigante")) {
            if (tipo.equalsIgnoreCase("Un ingrediente")) {
                precio = 12.99;
            } else if (tipo.equalsIgnoreCase("Especialidad")) {
                precio = 14.99;
            }
        }

        // Sumar ingrediente extra si aplica
        if (ingrediente_extra) {
            precio_final = precio + 1.99;
        } else {
            precio_final = precio;
        }
    }

}
