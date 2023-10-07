//Determina si una cadena de texto contiene la letra "a" y la letra "b"
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        //Verificar si la cadena contiene "a" y "b"
        if (cadena.contains("a") && cadena.contains("b")){
            System.out.println("La cadena ingresada contiene tanto 'a' como 'b'.");
        } else {
            System.out.println("La cadena ingresada no contiene ambas letras 'a' y 'b'.");
        }
        scanner.close();
    }
}
