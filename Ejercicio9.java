//Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña válidos
import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        //nombre de usuario y contraseña válidos predefinidos
        String usuarioValido = "ene";
        String contrasenaValida = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario:");
        String usuarioIngresado = scanner.nextLine();

        System.out.println("Ingrese su contraseña:");
        String contrasenaIngresada = scanner.nextLine();

        if (usuarioIngresado.equals(usuarioValido) && contrasenaIngresada.equals(contrasenaValida)){
            System.out.println("Acceso concedido. Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("Acceso denegado. Verifique su nombre de usuario y contraseña");
        }
        scanner.close();
    }
}


