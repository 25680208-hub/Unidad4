import java.util.Scanner;

public class BusquedaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaramos un arreglo de 7 números enteros
        int[] numeros = new int[7];

        System.out.println("=== Búsqueda de Número ===");

        // Pedimos los 7 números al usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Pedimos el número a buscar
        System.out.print("\nIngresa el número que deseas buscar: ");
        int buscar = input.nextInt();

        boolean encontrado = false; // Bandera para saber si se encontró el número
        int i = 0;

        // Ciclo while que busca el número en el arreglo
        while (i < numeros.length) {
            if (numeros[i] == buscar) {
                System.out.println("✅ Número encontrado en la posición (índice): " + i);
                encontrado = true;
                break; // Terminamos el ciclo al encontrarlo
            }
            i++; // Avanzamos al siguiente elemento
        }

        // Si no se encontró, mostramos mensaje
        if (!encontrado) {
            System.out.println("❌ El número no se encontró en el arreglo.");
        }

        input.close();
    }
}