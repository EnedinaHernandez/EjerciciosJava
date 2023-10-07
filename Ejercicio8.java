
//Verifica si un número es menor que 50 o mayor que 100
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();

        if (numero < 50 || numero > 100) {
            System.out.println("El número es menor que 50 o mayor que 100");
        } else {
            System.out.println("El número está en el rango de 50 a 100");
        }
        scanner.close();
    }
}
