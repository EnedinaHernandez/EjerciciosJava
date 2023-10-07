//Determina si una persona es adulta y no es jubilada.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿está jubilada? (sí o no)");
        String estaJubilada = scanner.nextLine().toLowerCase();

        if (edad >= 18 && estaJubilada.equals("no")) {
            System.out.println("La persona es adulta y no es jubilada");
        } else {
            System.out.println("La persona no cumple con los requisitos");
        }
        scanner.close();
    }
}
