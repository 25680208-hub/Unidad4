import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contraseña fija predefinida
        String contrasenaCorrecta = "sistemascomp2025";

        // Se permiten 3 intentos
        int intentos = 3;

        // Ciclo while para permitir varios intentos
        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String contrasenaIngresada = input.nextLine();

            // Verificamos si la contraseña es correcta
            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("✅ Acceso concedido.");
                break; // Salimos del ciclo si es correcta
            } else {
                intentos--; // Restamos un intento
                System.out.println("❌ Contraseña incorrecta. Te quedan " + intentos + " intento(s).");
            }

            // Si ya no quedan intentos, se niega el acceso
            if (intentos == 0) {
                System.out.println("🚫 Acceso denegado. Contacte a soporte.");
            }
        }

        input.close();
    }
}