
//Verifica si un número es par o si es múltiplo de 5
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa número");

        int numero = scanner.nextInt();

        if (numero % 2 == 0 || numero % 5 == 0) {
            System.out.println("El número es par o múltiplo de 5");
        } else {
            System.out.println("El número no es par ni múltiplo de 5");
        }
        scanner.close();
    }
}
