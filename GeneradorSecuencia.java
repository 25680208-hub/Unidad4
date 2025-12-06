import java.util.Scanner;

public class GeneradorSecuencia {

    // Función que genera una secuencia del 1 al número ingresado
    // e imprime "Par" o "Impar" según corresponda
    public static void generarSecuencia(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " → Par");
            } else {
                System.out.println(i + " → Impar");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Generador de Secuencia ===");
        System.out.print("Ingresa un número entero positivo: ");
        int N = input.nextInt();

        // Validamos que el número sea positivo
        if (N <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        } else {
            // Llamamos a la función que genera la secuencia
            generarSecuencia(N);
        }

        input.close();
    }
}