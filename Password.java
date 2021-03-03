import java.util.Scanner;
public class Password {
    //Atributos
    public int longitud = 8;
    public String contrasena = "";

    //Constructores
    Password(int longitud) {
        this.longitud = longitud;
    }

    // GETTERS
    public int getLongitud(){
        return longitud;
    }
    public String getContrasena(){
        return contrasena;
    }
    // SETTERS
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    // METODOS
    public boolean esFuerte(){

        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;
        int cuentaNumeros = 0;

        for (int i = 0; i < this.contrasena.length(); i++) {
            if (contrasena.charAt(i) >= 97 && contrasena.charAt(i) <= 122){
                cuentaMinusculas += 1;
            }
            else if (contrasena.charAt(i) >= 65 && contrasena.charAt(i) <= 90){
                cuentaMayusculas += 1;
            }
            cuentaNumeros += 1;
        }
        if (cuentaNumeros >= 5 && cuentaMinusculas >= 1 && cuentaMayusculas >= 2) {
            return true;
        } 
        return false;

    }
    public String generarPassword(){
        String pw = "";
        for (int i = 0; i < getLongitud(); i++) {
            int eleccion = ((int) Math.floor(Math.random()*3+1));
            if (eleccion == 1) {
                char minusculas = ((char) Math.floor(Math.random()* (123-97)+97));
                pw += minusculas;
            } 
            else if (eleccion == 2){
                char mayusculas = ((char) Math.floor(Math.random()* (91-65)+65));
                pw += mayusculas;

            }
            else {
                char numeros = ((char) Math.floor(Math.random()* (58-48)+48));
                pw += numeros;
            }
        }
        return pw;
    }
/*********************************************************** */
    //MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserta un tamano para la matriz: ");
        int num = scanner.nextInt();

        System.out.print("Inserta la longitud de las contrasenas: ");
        int longitud = scanner.nextInt();

        Password contrasena = new Password(longitud);

        String[] matrizContrasenas = new String[num];
        boolean[] matrizBoolean = new boolean[num];
        
        
        for (int i = 0; i < matrizContrasenas.length; i++) {
            matrizContrasenas[i] = contrasena.generarPassword();
            matrizBoolean[i] = contrasena.esFuerte();
            System.out.print("\n" + matrizContrasenas[i] + " ----> " + matrizBoolean[i] + "\n");
        }

    }
}
