
//Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha obtenido un resultado de "Aprobado" en su evaluación
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nota o el resultado de evalucaion (aprobado, no aprobado): ");
        String nota = scanner.nextLine();

        if (esNumero(nota) && Integer.parseInt(nota) >= 70 || nota.equalsIgnoreCase("aprobado")) {
            System.out.println("El estudiante aprobó");
        } else {
            System.out.println("El estudiante no aprobó");
        }
        scanner.close();
    }

    public static Boolean esNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

//El bloque try se utiliza para envolver el código que podría generar una excepción.
//El bloque catch se utiliza para capturar y manejar una excepción específica que ha sido generada en el bloque try.
