package com.example.Menus;
import java.util.Scanner;

public class Menu {

    private static int selectedIndex = 0;
    private static final String[] options = {
            "    • Agregar Contacto ",
            "    • Modificar Contacto ",
            "    • Eliminar Contacto",
            "    • Mostrar Contactos.",
            "    • Salir 🖚"
    };

    private static final String COLOR_RESET = "\u001B[0m";
    private static final String COLOR_SELECTED = "\u001B[32m"; // Verde
    private static final String COLOR_TEXT = "\u001B[36m";     // Cyan oscuro

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarOpciones();
            String input = scanner.nextLine();

            switch (input) {
                case "w":
                    selectedIndex = (selectedIndex == 0) ? options.length - 1 : selectedIndex - 1;
                    break;
                case "s":
                    selectedIndex = (selectedIndex == options.length - 1) ? 0 : selectedIndex + 1;
                    break;
                case "": // Enter
                    int opcion = selectedIndex + 1;
                    System.out.println("Seleccionaste: " + options[selectedIndex]);
                    if (opcion == 5) return;
                    break;
                default:
                    System.out.println("Usa 'w' para subir, 's' para bajar, Enter para seleccionar.");
                    break;
            }
        }
    }

    private static void mostrarOpciones() {
        System.out.println("\n\n\n");
        System.out.println("                                ████████ ██  ███     ██████ ██████ ███   ████████ █████ ");
        System.out.println("                                     \u2554═════════════════════════════════════════════════════════════════════════════════\u2557");
        System.out.println("                                     \u2551                      🌟 --- Agenda De Contactos --- 🌟                      \u2551");
        System.out.println("                                     \u255A═════════════════════════════════════════════════════════════════════════════════\u255D");

        System.out.println("                                                 \u2554═══════════════════════════════════════════════════\u2557");
        for (int i = 0; i < options.length; i++) {
            if (i == selectedIndex) {
                System.out.print("                                                            ➡ " + COLOR_SELECTED);
            } else {
                System.out.print("                                                              " + COLOR_TEXT);
            }
            System.out.println(options[i] + COLOR_RESET);
        }
        System.out.println("                                                 \u255A═══════════════════════════════════════════════════\u255D\n");
        System.out.println("     Usa las teclas 'w' para arriba, 's' para abajo y Enter para seleccionar.");
    }
}
