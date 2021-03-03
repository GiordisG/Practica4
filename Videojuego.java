public class Videojuego {
    //Atributos
    public String titulo;
    public int horasEstimadas = 10;
    public boolean entrega = false;
    public String genero;
    public String compania;

    /********************** */
    //Constructor por defecto
    Videojuego(){

    }
    //Constructor con titulo y horas
    Videojuego(String titulo, int horas){
        this.titulo = titulo;
        this.horasEstimadas = horas;
    }
    //Constructor con los atributos excepto entregado
    Videojuego(String titulo, int horas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horas;
        this.genero = genero;
        this.compania = compania;
    }
    /****************************************************** */
    //Metodos GETTER
    public String getTitulo(){
        return titulo;          // para titulo
    }
    public int getHorasEstimadas(){
        return horasEstimadas;    // para horas estimadas
    }
    public String getGenero(){
        return genero;          // para genero
    }
    public String getCompania(){
        return compania;            // para creador
    }
    // Metodos SETTER
    public void setTitulo(String titulo){
        this.titulo = titulo;               // para titulo
    }
    public void setHorasEstimadas(int horas){
        this.horasEstimadas = horas;             // para horas estimadas
    }
    public void setGenero(String genero){
        this.genero = genero;               // para genero
    }
    public void setCompania(String compania){
        this.compania = compania;               // para creador
    }

    /*********************** */
    // metodo toString para retornar la informacion
    public String toString(){
        return "\nTitulo: " + titulo + "\nHoras estimadas: " + horasEstimadas + "\nGenero: " + genero + "\nCompania: " + compania +"\n";
    }
    
    /*********************************** */
    // MAIN
    public static void main(String[] args) {
        
        Videojuego juego1 = new Videojuego("Modern Combat", 7);
        System.out.print(juego1.toString());

        Videojuego juego2 = new Videojuego("Call Of Duty", 9, "Accion", "Unity");
        System.out.print(juego2.toString());
    }
}
