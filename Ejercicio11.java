
//Verifica si un número es primo y menor que 100
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");

        int n = scanner.nextInt();
        boolean resultado = esPrimo(n);

        if (resultado == true && n <= 100) {
            System.out.println("El número es Primo y menor que 100");
        } else {
            System.out.println("El número no es Primo");
        }

        scanner.close();

    }

    public static boolean esPrimo(int n) {

        if (n <= 1) { // Los números menores o iguales a 1 no son primos
            return false;
        }
        if (n <= 3) { // los números 2 y 3 son primos
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) { // Comprueba si el numero es divisible por 2 o por 3, y si son divisibles no son
                                        // números primos
            return false;
        }
        for (int i = 5; i * i <= n; i += i) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}