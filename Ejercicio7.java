//Comprueba si una persona es mayor de edad y tiene un permiso de conducir
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Tiene permiso de conducir? (Si o No)");
        String tienePermiso = scanner.nextLine().toLowerCase(); // convertir a minúscula
        if (edad >= 18 && tienePermiso.equals("si")) {
            System.out.println("La persona es mayor de edad y tiene permiso de conducir");
        } else {
            System.out.println("No cumple con los requisitos para conducir");
        }
        scanner.close();
    }
}
