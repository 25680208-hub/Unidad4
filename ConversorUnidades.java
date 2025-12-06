import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        System.out.print("Elige una opción (1, 2 o 3): ");
        int opcion = input.nextInt();

        double valor, resultado;

        switch (opcion) {
            case 1:
                // Conversión de kilómetros a millas
                System.out.print("Ingresa los kilómetros: ");
                valor = input.nextDouble();
                resultado = valor * 0.621371;
                System.out.println(valor + " km = " + resultado + " millas");
                break;

            case 2:
                // Conversión de grados centígrados a Fahrenheit
                System.out.print("Ingresa los grados centígrados: ");
                valor = input.nextDouble();
                resultado = (valor * 9 / 5) + 32;
                System.out.println(valor + " °C = " + resultado + " °F");
                break;

            case 3:
                // Conversión de metros a pies
                System.out.print("Ingresa los metros: ");
                valor = input.nextDouble();
                resultado = valor * 3.28084;
                System.out.println(valor + " m = " + resultado + " pies");
                break;

            default:
                // Si el usuario no elige una opción válida
                System.out.println("Opción no válida.");
        }

        input.close();
    }
}