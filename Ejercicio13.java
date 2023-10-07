//Comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y menor que 30

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();

        if (numero > 5 && numero < 10) {
            System.out.println("El número es mayor que 5 y menor que 10");
        } else if (numero > 20 && numero < 30) {
            System.out.println("El número es mayor que 20 y menor que 30");
        } else {
            System.out.println("No cumple con las condiciones");
        }
        scanner.close();
    }
    
}
