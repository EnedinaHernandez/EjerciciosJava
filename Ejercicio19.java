//Comprueba si un número es mayor que 100 o si es menor que -100

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 100 || numero < -100) {
            System.out.println("El número es mayor que 100 o menor que -100");
        } else {
            System.out.println("No cumple con la consición");
        }
        scanner.close();
    }
}
