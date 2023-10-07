// Comprueba si un número es mayor que 10 y menor que 20

import java.util.Scanner; //importa la clase scanner
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");  // Crea un objeto Scanner para leer la entrada del teclado
        // Lee el número ingresado por el usuario
        int numero = scanner.nextInt();

        if (numero > 10 && numero < 20) {
            System.out.println("El número está entre 10 y 20.");
        } else {
            System.out.println("El número no está entre 10 y 20.");
        }
        scanner.close();
    }
}
