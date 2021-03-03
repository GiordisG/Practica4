import java.util.Scanner;

public class Serie {
    // Atributos de la clase
    public String titulo;
    public int numTemporadas = 3;
    public boolean entrega = false;
    public String genero;
    public String creador;

    /******************************************* */
    //Constructor por defecto
    Serie(){

    }
    //Constructor con titulo y creador
    Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    //Constructor con todos los atributos menos el atributo entregado
    Serie(String titulo, int numTemp, String genero, String creador){
        this.titulo = titulo;
        this.numTemporadas = numTemp;
        this.genero = genero;
        this.creador = creador;
    }

    /****************************************************** */
    //Metodos GETTER
    public String getTitulo(){
        return titulo;          // para titulo
    }
    public int getNumTemporadas(){
        return numTemporadas;       // para numero de temporadas
    }
    public String getGenero(){
        return genero;          // para genero
    }
    public String getCreador(){
        return creador;            // para creador
    }
    // Metodos SETTER
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setNumTemporadas(int num){
        this.numTemporadas = num;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCreador(String creador){
        this.creador = creador;
    }
    /**************************************************** */

    //Metodo toString para imprimir la informacion
    public String toString(){
        return "\nTitulo: " + titulo + "\nNumero de temporadas: " + numTemporadas + "\nGenero: " + genero + "\nCreador: " + creador + "\nEstado de la entrega: " + entrega + "\n";
    }
    /*************************************************************** */
    // MAIN
    public static void main(String[] args) {

        Serie serie1 = new Serie("Star Wars", "Pepito Sanches");
        System.out.print(serie1.toString());

        Serie serie2 = new Serie("CobraKai", 5, "Ciencia Ficcion, Accion, Aventura", "Lipita Rodriguez");
        System.out.print(serie2.toString());
    }
}
