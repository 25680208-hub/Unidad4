import java.util.Scanner;

public class InversorArreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creamos un arreglo de 5 números enteros
        int[] numeros = new int[5];

        System.out.println("=== Inversor de Arreglo Numérico ===");

        // Pedimos al usuario los 5 valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\nArreglo en orden inverso:");

        // Recorremos el arreglo desde el final hacia el inicio
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        input.close();
    }
}