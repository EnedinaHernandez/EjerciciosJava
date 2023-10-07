//Verifica si un número es divisible por 2 y por 3.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrse un número: ");
        int numero = scanner.nextInt();

        //Verifica si el número es divisible por 2 o por 3
        if (numero % 2 ==0 && numero % 3 ==0){
            System.out.println("El número " + numero + " es divisible por 2 y por 3");
        }else{
            System.out.println("El número " + numero + " no es divisible por 2 y por 3");
        }
        scanner.close();
    }
}
