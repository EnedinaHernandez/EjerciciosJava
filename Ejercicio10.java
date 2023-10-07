
//Comprueba si un número es negativo o si es cero
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");

        int numero = scanner.nextInt();

        if (numero < 0 || numero == 0){
            System.out.println("El número es negativo o igual a cero");
        }else{
            System.out.println("El número no es negativo ni igual a cero");
        }
        scanner.close();
    }
}
