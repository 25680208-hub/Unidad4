import java.util.Scanner;

public class CalculadoraPromedio {

    // Función que calcula el promedio de un arreglo de números flotantes
    public static double calcularPromedio(float[] calificaciones, int tamaño) {
        float suma = 0;

        // Recorremos el arreglo y sumamos todos los valores
        for (int i = 0; i < tamaño; i++) {
            suma += calificaciones[i];
        }

        // Retornamos el promedio dividiendo la suma entre el número de elementos
        return suma / tamaño;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Calculadora de Promedio ===");

        // Declaramos un arreglo de 5 calificaciones
        float[] calificaciones = new float[5];

        // Pedimos las 5 calificaciones al usuario
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = input.nextFloat();
        }

        // Llamamos a la función para calcular el promedio
        double promedio = calcularPromedio(calificaciones, calificaciones.length);

        // Mostramos el resultado
        System.out.println("\nEl promedio de las 5 calificaciones es: " + promedio);

        input.close();
    }
}