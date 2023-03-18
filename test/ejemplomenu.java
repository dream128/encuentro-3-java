import java.util.Scanner;

public class ejemplomenu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1");
                    // Aquí va la lógica de la opción 1
                    break;

                case 2:
                    System.out.println("Has elegido la opción 2");
                    // Aquí va la lógica de la opción 2
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (!salir) {
                System.out.print("Presiona cualquier tecla para continuar...");
                leer.nextLine();
                leer.nextLine(); // Espera a que el usuario presione una tecla
            }

        } while (!salir);
    }
}