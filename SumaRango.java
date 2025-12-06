import java.util.Scanner;

public class SumaRango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Suma de Rango ===");

        // Pedimos los números A y B al usuario
        System.out.print("Ingresa el número inicial (A): ");
        int A = input.nextInt();

        System.out.print("Ingresa el número final (B): ");
        int B = input.nextInt();

        // Verificamos que A sea menor o igual que B
        if (A > B) {
            System.out.println("El número inicial no puede ser mayor que el final.");
            input.close();
            return;
        }

        int suma = 0; // Variable para acumular la suma

        // Ciclo for que recorre desde A hasta B
        for (int i = A; i <= B; i++) {
            suma += i; // Acumulamos cada número
        }

        // Mostramos el resultado
        System.out.println("La suma de los números entre " + A + " y " + B + " es: " + suma);

        input.close();
    }
}