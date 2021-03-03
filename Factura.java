import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Factura {
    Random random = new Random();
    DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
    // Atributos
    public int numFactura;
    public String fechaFactura;
    public double totalApagar;
    public double ITBIS;
    public int monto;
    public double descuento;
    public int submonto;
    public String libro;
    public String[] matrizLibros = new String[10];
    public int[] precio = new int[10];
    public int[] cantidad = new int[50];
    public int[] matrizFacturas = new int[10];

    // Constructores
    Factura(){

    }
    Factura(String libro, double descuento){
        this.libro = libro;
        this.descuento = descuento;
    }
    
    // SETTERS
    public void setLibros(String libro, int precio, int cantidad){
        for (int i = 0; i < matrizLibros.length; i++) {
            if (libro != matrizLibros[i]){
                this.libro = libro;
                this.matrizLibros[i] = libro;
                this.precio[i] = precio;
                this.cantidad[i] = cantidad;
                this.submonto = (cantidad * precio);
            }
        }
    }

    //GETTERS
    public int getFactura(){
        return numFactura;
    }
    public String getFechaFactura(){
        return fechaFactura;
    }
    public double getTotalApagar(){
        return totalApagar;
    }
    public double getITBIS(){
        return ITBIS;
    }
    public double getDescuento(){
        return descuento;
    }
    public double getMonto(){
        return monto;
    }
    /************************************************* */

    // METODO PARA CALCULAR EL MONTO
    public void calcularMonto(){
        this.monto = this.submonto;
    }

    //METODO PARA CALCULAR ITBIS
    public void calcularItbis(){
        this.ITBIS = this.monto * 0.13;
    }

    //METODO PARA CALCULAR DESCUENTO
    public void calcularDescuento(){
        this.descuento = (10 * this.monto / 100);
    }

    // METODO PARA GENERAR NUMERO DE FACTURA
    public void generar_num_factura(){
        for (int i = 0; i < matrizFacturas.length; i++) {
            int num = random.nextInt(900000) + 1;

            if(num != matrizFacturas[i]){
                this.numFactura = num;
                matrizFacturas[i] = getFactura();
            }
        }
    }

    //METODO PARA OBTENER LA FECHA
    public void obtener_fecha() {
        this.fechaFactura = fecha.format(LocalDateTime.now());
    }

    //METODO PARA CALCULAR EL TOTAL A PAGAR
    public void calcularTotalApagar(){
        this.totalApagar = (this.monto + this.ITBIS) - this.descuento;
    }

    //METODO PARA IMPRIMIR FACTURA
    public String toString(){
        for (int i = 0; i < matrizLibros.length; i++) {
            if (this.libro == matrizLibros[i]) {
                return "\nFACTURA" + "\nNOMBRE DEL LIBRO -------> " + matrizLibros[i] + "\nCOSTO DEL LIBRO ------> " + precio[i] + "\nITBIS -------> " + ITBIS + "\nDescuento -------> " + descuento + "\nTOTAL A PAGAR -------> " + totalApagar + "\nNUMERO DE FACTURA -------> " + numFactura + "\nFECHA ------> " + fechaFactura + "\nGRACIAS POR SU COMPRA" + "\n ";
            }
        }return "ERROR";
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String titulo;
        int precio;
        int cantidad;
        Libro libro = new Libro();
        Factura factura = new Factura("pedro", 5);

        System.out.print("Intruduzca titulo del libro: ");
        titulo = scanner.nextLine();
        libro.setTitulo(titulo);
        System.out.print("Introduzca el precio del libro: ");
        precio = scanner.nextInt();
        libro.setPrecio(precio);
        System.out.print("Introduzca la cantidad de los libros: ");
        cantidad = scanner.nextInt();
        libro.setCantidad(cantidad);

        factura.setLibros(libro.getTitulo(), libro.getPrecio(), libro.getCantidad());
        factura.calcularMonto();
        factura.calcularItbis();
        factura.calcularDescuento();
        factura.calcularTotalApagar();
        factura.generar_num_factura();
        factura.obtener_fecha();
        System.out.print(factura.toString());
    }
}
