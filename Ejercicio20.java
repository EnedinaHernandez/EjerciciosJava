
//Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene una invitación especial
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Tiene una invitación especial? (Sí o No)");
        String tieneInvitación = scanner.nextLine().toLowerCase();

        if (edad >= 18 || tieneInvitación.equals("si")) {
            System.out.println("Tiene acceso a la sala VIP");
        } else {
            System.out.println("No tiene acceso a la sala VIP");
        }
        scanner.close();
    }
}
