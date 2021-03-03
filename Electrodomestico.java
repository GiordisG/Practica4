public class Electrodomestico {
    // atributos de la superclase 
    public int precioBase = 100;
    public String color = "blanco";
    public String consumoEnergetico = "f";
    public double peso = 5.0;

    // matriz con los colores disponibles
    String[] coloresDisp = {"blanco", "negro", "rojo", "azul", "gris"};

    /********************************************************************** */

    // Constructor por defecto
    Electrodomestico(){

    }
    // Constructor con el precio y peso
    Electrodomestico(int precio, double peso){
        this.precioBase = precio;
        this.peso = peso;
    }
    // Constructor con todos los atributos
    Electrodomestico(int precio, String color, String consumoE, double peso){
        this.precioBase = precio;
        this.color = color;
        this.consumoEnergetico = consumoE;
        this.peso = peso;
    }

    /************************************************************************** */
    // Metodos Get de todos los atributos
    public int getPrecioBase(){
        return precioBase; // para precio base
    }
    public String getColor(){
        return color;  // para color
    }
    public String getConsumoEnergetico(){
        return consumoEnergetico; // para consumo energetico
    }
    public double getPeso(){
        return peso; // para peso
    }
}
