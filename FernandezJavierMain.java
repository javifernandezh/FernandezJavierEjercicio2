import java.util.Scanner;

public class FernandezJavierMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcionPlato = seleccionarOpcion(
                new String[]{"Hamburguesa", "Chicken Burger", "Nuggets"},
                "plato principal"
        );

        int opcionComplemento = seleccionarOpcion(
                new String[]{"Patatas fritas", "Tomates Cherry", "Ensalada"},
                "complemento"
        );

        int opcionPostre = seleccionarOpcion(
                new String[]{"Manzana", "Piña", "Brocheta de fruta"},
                "postre"
        );

        int opcionBebida = seleccionarOpcion(
                new String[]{"Agua", "Zumo de naranja", "Zumo de piña"},
                "bebida"
        );

        System.out.println("\nResumen provisional de su pedido:");
        System.out.println("Plato principal: " + obtenerNombre(opcionPlato, new String[]{"Hamburguesa", "Chicken Burger", "Nuggets"}));
        System.out.println("Complemento: " + obtenerNombre(opcionComplemento, new String[]{"Patatas fritas", "Tomates Cherry", "Ensalada"}));
        System.out.println("Postre: " + obtenerNombre(opcionPostre, new String[]{"Manzana", "Piña", "Brocheta de fruta"}));
        System.out.println("Bebida: " + obtenerNombre(opcionBebida, new String[]{"Agua", "Zumo de naranja", "Zumo de piña"}));
    }

    private static int seleccionarOpcion(String[] opciones, String tipo) {
        int opcion = -1;

        do {
            System.out.println("\nSeleccione un " + tipo + ":");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine()) - 1;

                if (opcion < 0 || opcion >= opciones.length) {
                    System.out.println("Opción fuera de rango. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número.");
                opcion = -1;
            }

        } while (opcion < 0 || opcion >= opciones.length);

        return opcion;
    }

    private static String obtenerNombre(int indice, String[] opciones) {
        return opciones[indice];
    }
}
