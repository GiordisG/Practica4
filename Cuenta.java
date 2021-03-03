
import java.util.Scanner;
public class Cuenta {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double cantidad;
        String titular;
        int opcion;
        double cuenta = 0;
        System.out.print("Ingresar Titular: ");
        titular = scanner.nextLine();

        while(true){
        
            System.out.println("Bienvenido " + titular + " Que desea realizar?");
            System.out.print("1. Ingresar cantidad\n2. Retirar cantidad\n3. Consular Saldo\n4.SALIR\n OPCION -> ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad");
                    cantidad = scanner.nextDouble();
                    cuenta += ingresar(cantidad,cuenta);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad");
                    cantidad = scanner.nextDouble();
                    cuenta -= retirar(cantidad, cuenta);
                    break;
                case 3:
                    toString(titular, cuenta);
                    break;
                default:
                    System.out.println("Pase Buen Dia!");
                    return;
               
            }
        }

    }
    public static double ingresar(double cantidad, double cuenta){
        if (cantidad <= 0) {
            System.out.println("Necesita agregar una cantidad mayor a 0\n");
            return 0;
        } else {
            cuenta += cantidad;
            System.out.print("Cantidad agragada exitosamente!\n");
            return cuenta;
        }
    }
    public static double retirar(double cantidad, double cuenta){
        if ((cuenta - cantidad) <= 0) {
            cuenta = 0;
            return cuenta;
        } else {
            cuenta -= cantidad;
            System.out.println("Cantidad retirada exitosamente!\n");
            return cuenta;
        }
    }
    public static void toString(String titular, double cuenta){
        System.out.println("El titular " + titular + " tiene " + cuenta + " pesos en la cuenta\n");
    }
}
