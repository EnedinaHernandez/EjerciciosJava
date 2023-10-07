//Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada legalmente

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿La persona está inhabilitada para votar legalmente? (sí o no)");
        String inhabilitadaLegalmente = scanner.nextLine().toLowerCase();
        // scanner.nextLine();

        if (edad >= 18 && inhabilitadaLegalmente.equals("no")) {
            System.out.println("Sí puede votar");
        } else {
            System.out.println("No puede votar");
        }
        scanner.close();
    }
}
