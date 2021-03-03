import java.io.IOException;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        String sexo = "H";
        double peso;
        double altura;
        int cedula;

        System.out.print("Ingresar nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingresar edad: ");
        edad = scanner.nextInt();
        System.out.print("Ingresar peso: ");
        peso =  scanner.nextDouble();
        System.out.print("Ingresar altura: ");
        altura = scanner.nextDouble();

        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
        //comprobar si persona3 esta en su peso ideal
        System.out.print(persona3.calcularPesoIdeal(peso));
        //Comprobar si persona3 es mayor de edad
        System.out.print(persona3.esMayorDeEdad());
        //mostrar informacion de persona3 
        System.out.print(persona3.toString());

        Persona persona4 = new Persona(nombre, edad, sexo);
        /*//comprobar si persona3 esta en su peso ideal
        persona4.calcularPesoIdeal(peso);
        //comprobar si persona4 es mayor de edad
        persona4.esMayorDeEdad();
        // monstrar informacion de persona4 
        persona4.toString();*/

    }
}