import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mostramos el menú al usuario
        System.out.println("=== Calculadora de Área ===");
        System.out.println("1. Calcular área de un círculo");
        System.out.println("2. Calcular área de un rectángulo");
        System.out.print("Elige una opción (1 o 2): ");
        int opcion = input.nextInt();

        double area = 0; // Variable donde se guardará el área

        if (opcion == 1) {
            // Si elige círculo
            System.out.print("Ingresa el radio del círculo: ");
            double radio = input.nextDouble();
            area = Math.PI * radio * radio; // Fórmula del área del círculo
            System.out.println("El área del círculo es: " + area);
        } else if (opcion == 2) {
            // Si elige rectángulo
            System.out.print("Ingresa la base: ");
            double base = input.nextDouble();
            System.out.print("Ingresa la altura: ");
            double altura = input.nextDouble();
            area = base * altura; // Fórmula del área del rectángulo
            System.out.println("El área del rectángulo es: " + area);
        } else {
            // Si el usuario elige una opción inválida
            System.out.println("Opción no válida.");
            return; // Finaliza el programa
        }

        // Comparamos si el área es mayor o menor que 100
        if (area > 100) {
            System.out.println("El área es mayor que 100 unidades cuadradas.");
        } else {
            System.out.println("El área es menor o igual que 100 unidades cuadradas.");
        }

        input.close();
    }
}