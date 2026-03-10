import java.util.Random;
import java.util.Scanner;

public class FernandezJavierMain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

        int opcionPlato = seleccionarOpcion(
                new String[]{"Hamburguesa", "Chicken Burger", "Nuggets"},
                new double[]{2.50, 2.75, 2.00},
                "plato principal"
        );

        int opcionComplemento = seleccionarOpcion(
                new String[]{"Patatas fritas", "Tomates Cherry", "Ensalada"},
                new double[]{2.00, 1.50, 1.75},
                "complemento"
        );

        int opcionPostre = seleccionarOpcion(
                new String[]{"Manzana", "Piña", "Brocheta de fruta"},
                new double[]{1.00, 1.25, 1.50},
                "postre"
        );

        int opcionBebida = seleccionarOpcion(
                new String[]{"Agua", "Zumo de naranja", "Zumo de piña"},
                new double[]{1.00, 1.50, 1.50},
                "bebida"
        );

        String sorpresa = generarSorpresa();

        FernandezJavierMenu menu = new FernandezJavierMenu(
                obtenerNombre(opcionPlato, new String[]{"Hamburguesa", "Chicken Burger", "Nuggets"}),
                obtenerPrecio(opcionPlato, new double[]{2.50, 2.75, 2.00}),
                obtenerNombre(opcionComplemento, new String[]{"Patatas fritas", "Tomates Cherry", "Ensalada"}),
                obtenerPrecio(opcionComplemento, new double[]{2.00, 1.50, 1.75}),
                obtenerNombre(opcionPostre, new String[]{"Manzana", "Piña", "Brocheta de fruta"}),
                obtenerPrecio(opcionPostre, new double[]{1.00, 1.25, 1.50}),
                obtenerNombre(opcionBebida, new String[]{"Agua", "Zumo de naranja", "Zumo de piña"}),
                obtenerPrecio(opcionBebida, new double[]{1.00, 1.50, 1.50}),
                sorpresa
        );

        System.out.println("\n----- RESUMEN DEL MENÚ -----");
        System.out.println(menu.obtenerResumen());
        System.out.println("\n¡Gracias por su pedido!");
    }

    private static int seleccionarOpcion(String[] nombres, double[] precios, String tipo) {
        int opcion = -1;
        do {
            System.out.println("\nSeleccione un " + tipo + ":");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i] + " - " + precios[i] + "€");
            }
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine()) - 1;
                if (opcion < 0 || opcion >= nombres.length) {
                    System.out.println("Opción fuera de rango. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número.");
                opcion = -1;
            }
        } while (opcion < 0 || opcion >= nombres.length);
        return opcion;
    }

    private static String obtenerNombre(int indice, String[] nombres) {
        return nombres[indice];
    }

    private static double obtenerPrecio(int indice, double[] precios) {
        return precios[indice];
    }

    private static String generarSorpresa() {
        String[] sorpresas = {"Chuches", "Libro", "Juguete"};
        int indice = random.nextInt(sorpresas.length);
        return sorpresas[indice];
    }
}