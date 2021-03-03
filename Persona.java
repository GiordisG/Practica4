import java.util.Random;
import java.util.Scanner;

public class Persona {
    Random random = new Random();
    // atributos
    protected int edad = 0;
    protected int cedula;
    private String nombre = "";
    protected String sexo = "H";
    protected double altura = 0;
    protected double peso = 0;
    public static int counter = 0;

    Persona(){
        counter++;
    }
    // primer constructor
    Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // segundo constructor
    Persona(String nombre, int edad, int cedula, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // set y get para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }// set y get pra edad

    public int getEdad() {
        return edad;
    }

    public void setEdad(int age) {
        this.edad = age;
    }// set y get para sexo

    public String getSexo() {
        return sexo;
    }
    // set y get para la altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // set y get para el peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // metodo para conversion de pie a metros
    public double convertirPieAMetros(double pie) {
        double metros = pie / 3.281;
        return metros;
    }

    // metodo para conversion de libras a kilogramos
    public double convertirLibraAKilogramos(double libra) {
        double kilogramo = libra / 2.205;
        return kilogramo;
    }

    // metodo para calcular el peso ideal
    public String calcularPesoIdeal(double peso) {
        peso /= Math.pow(getAltura(), 2);
        if (peso >= 20 || peso <= 25) {
            return "\nEstas por debajo de tu peso ideal";
        } else if (peso > 25) {
            return "\nTienes sobrepeso";
        }return "\nEstas en tu peso ideal";
    }

    public String esMayorDeEdad() {
        if (edad > 18) {
            return "\nMayor de edad";
        }
        return "\nMenor de edad";
    }

    public void comprobarSexo(String sexo) {
        if (sexo != getSexo()) {
            this.sexo = sexo;
        }
    }

    public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\ncudula: " + cedula + "\nSexo: " + sexo + "\nAltura: " + altura + "\nPeso: " + peso;
    }

    public int generCedula() {
        int cedula = random.nextInt(900000000) + 10000000;
        return cedula;

    }


    /************************************************************* */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = "";
        int edad = 0;
        String sexo = "H";
        double peso = 0;
        double altura = 0;
        int cedula = 0;

        Persona persona1 = new Persona(nombre, edad, cedula, sexo, altura, peso);
        persona1.generCedula();
        System.out.print(persona1.toString());


    }
}


