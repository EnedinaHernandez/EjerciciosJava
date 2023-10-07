
//Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra "Python"
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto");
        String texto = scanner.nextLine();

        if (texto.contains("Java") && !texto.contains("python")) { // método contains paraverificar si el texto contiene
                                                                   // la palabra java
            System.out.println("El texto contiene Java y no contiene Python");
        } else {
            System.out.println("No cumple con las condiciones");
        }
        scanner.close();
    }
}
