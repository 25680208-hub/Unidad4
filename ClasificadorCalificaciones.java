import java.util.Scanner;

public class ClasificadorCalificaciones {

    // Función que clasifica una calificación según su valor numérico
    public static String clasificarCalificacion(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return "Sobresaliente";
        } else if (calificacion >= 80) {
            return "Notable";
        } else if (calificacion >= 70) {
            return "Aprobatorio";
        } else {
            return "Reprobatorio";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Clasificador de Calificaciones ===");
        System.out.print("Ingresa tu calificación (0 a 100): ");
        int calificacion = input.nextInt();

        // Validamos que esté en el rango correcto
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificación fuera de rango.");
        } else {
            // Llamamos a la función y mostramos el resultado
            String resultado = clasificarCalificacion(calificacion);
            System.out.println("Tu desempeño es: " + resultado);
        }

        input.close();
    }
}