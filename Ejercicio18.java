// Determina si un triángulo es equilátero o isósceles.

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.println("Ingrese lado 2: ");
        int lado2 = scanner.nextInt();

        System.out.println("Ingrese lado 3: ");
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El trinagulo es escaleno");
        }
        scanner.close();
    }
}
