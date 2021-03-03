import java.util.Scanner;
import java.util.Random;

public class Libro {
    Random random = new Random();
    
    // Atributos
    public int _isbn; 
    public int e_Registro;
    public int e_Titular;
    public int e_Publicacion;
    public int digito_Control;
    public String titulo;
    public String autor;
    public int paginasNum;
    public int precio;
    public int cantidad;

    /*************** */
    //Constructores
    Libro(){
        
    }
    Libro(String titulo, String autor, int paginas, int precio, int _isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.paginasNum = paginas;
        this.precio = precio;
        this._isbn = _isbn;
    }
    /******************* */

    // GETTERS
    public int get_isbn(){
        return _isbn;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginasNum(){
        return paginasNum;
    }
    public int getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int getE_Registro(){
        return e_Registro;
    }
    public int getE_Titular(){
        return e_Titular;
    }
    public int getE_Publicacion(){
        return e_Publicacion;
    }
    public int getDigito_Control(){
        return digito_Control;
    }

    //SETTERS
    public void set_isbn(int isbn){
        this._isbn = isbn;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPaginasNum(int paginas){
        this.paginasNum = paginas;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setE_Registro(int r){
         this.e_Registro = r;
    }
    public void setE_Titular(int t){
         this.e_Titular = t;
    }
    public void setE_Publicacion(int p){
         this.e_Publicacion = p;
    }
    public void setDigito_Control(int c){
         this.digito_Control = c;
    }
    /************************************** */
    // Salida de datos
    public String toString(){
        return "\nEl libro " + titulo + " creador por " + autor +" tiene " + paginasNum + " paginas"+"\n" + "Su ISBN es :" + _isbn + " " + e_Registro + " " + e_Titular + " " + e_Publicacion  + "\n";
    }
    
    //introduciendo un isbn
    public void introducirIsnb(int prefijo){
        if(prefijo != 978 || prefijo != 979){
            System.out.print("Solo se permite un prefijo 978 o 979");
        }
        set_isbn(prefijo);
    }

    public void generarElementoR(){
       setE_Registro(random.nextInt(90000) + 1);
    }

    public void generarElementoT(){
        setE_Titular(random.nextInt(9000000) + 1);
    }
    public void generarElementoP(){
        setE_Publicacion(random.nextInt(900000) + 1);
    }

/************************************************************* */
    //MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Atributos
        int _isbn;
        String titulo;
        String autor;
        int paginas;
        int precio;
        
        System.out.print("\nIntroducir titulo del libro: ");
        titulo = scanner.nextLine();
        System.out.print("\nIntroducir autor del libro: ");
        autor = scanner.nextLine();
        System.out.print("\nIntroducir paginas del libro: ");
        paginas = scanner.nextInt();
        System.out.print("\nIntroducir precio del libro: ");
        precio = scanner.nextInt();
        System.out.print("\nIngresa uno de los dos prefijos: 978 o 979: ");
        _isbn = scanner.nextInt();
        
        Libro libro1 = new Libro(titulo, autor, paginas, precio, _isbn);
        libro1.generarElementoR();
        libro1.generarElementoT();
        libro1.generarElementoP();
        System.out.print(libro1.toString());



    }
}
