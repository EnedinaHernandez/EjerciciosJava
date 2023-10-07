
//Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una nota");

        int nota = scanner.nextInt();

        if (nota >= 60 && nota <= 100) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }
        scanner.close();
    }
}
