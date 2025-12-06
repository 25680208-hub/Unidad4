import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaramos un arreglo de 10 caracteres
        char[] letras = new char[10];

        System.out.println("=== Contador de Vocales ===");
        System.out.println("Ingresa 10 letras minúsculas:");

        // Llenamos el arreglo con letras ingresadas por el usuario
        for (int i = 0; i < letras.length; i++) {
            System.out.print("Letra " + (i + 1) + ": ");
            letras[i] = input.next().toLowerCase().charAt(0); // Tomamos solo el primer carácter
        }

        int contadorVocales = 0; // Contador de vocales

        // Recorremos el arreglo para contar las vocales
        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        // Mostramos el resultado
        System.out.println("\nCantidad de vocales encontradas: " + contadorVocales);

        input.close();
    }
}