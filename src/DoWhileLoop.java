import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            // Scanner lee lo que se ingresa por teclado
            Scanner sc = new Scanner(System.in);

            // obtener el valor que se ingresa por teclado
            // lo asignamos a una variable que sea del tipo de
            // dato que esperamos recibir.
            response = Integer.valueOf(sc.nextLine());
            /*
            *  input.nextInt(), captura un numero entero.
            *  Se asigna a una variable de tipo int.
            ** input.nextDouble()**, captura un numero decimal.
            *  Se asigna a una variable de tipo double.
            ** input.nextLine(): captura toda la linea. Se asigna a una
            * variable String
            ** Input.nextChar() ++no existe! ++Para capturar un char
            * utilizaremos input.next().charAt[0];
            * */

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (response != 0);

        System.out.println("Se terminó el programa");
    }
}
