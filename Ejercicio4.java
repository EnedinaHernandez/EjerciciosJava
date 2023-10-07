
//Comprueba si un número es positivo y no es igual a cero.
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = scanner.nextInt();

        if (numero > 0 && numero != 0) {
            System.out.println("El número es positivo y no es igual a cero");
        } else {
            System.out.println("El número es negativo o es igual a cero");
        }

        scanner.close();
    }
}
