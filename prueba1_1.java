package acceso_datos;

import java.io.File;

public class prueba1_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No se proporcionó la ruta del directorio.");
            return;
        }

        String ruta = args[0];
        File file = new File(ruta);

        if (!file.exists()) {
            System.out.println("Error: La ruta proporcionada no existe.");
            return;
        }

        if (!file.isDirectory()) {
            System.out.println("Error: La ruta proporcionada no apunta a un directorio.");
            return;
        }

        try {
            if (args.length > 1 && args[1].equals("-r")) {
                informacion(ruta, 0);
            } else {
                String[] lista = file.list();
                if (lista.length == 0) {
                    System.out.println("El directorio está vacío.");
                } else {
                    for (String nombre : lista) {
                        File cont = new File(ruta, nombre); // Uso de File(File, String) para manejar nombres con espacios
                        if (cont.isDirectory()) {
                            System.out.printf("%-20s es un directorio\n", nombre);
                        } else {
                            System.out.printf("%-20s es un fichero\n", nombre);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void informacion(String ruta, int veces) {
        File file = new File(ruta);
        String[] lista = file.list();
        if (lista.length == 0) {
            for (int i = 0; i < veces; i++) {
                System.out.print("\t");
            }
            System.out.println("El directorio está vacío.");
        } else {
            for (String nombre : lista) {
                for (int i = 0; i < veces; i++) {
                    System.out.print("\t");
                }
                String ruta2 = ruta + File.separator + nombre; // Uso de File.separator para compatibilidad multiplataforma
                File cont = new File(ruta2);
                if (cont.isDirectory()) {
                    System.out.printf("%-20s es un directorio\n", nombre);
                    informacion(ruta2, veces + 1);
                } else {
                    System.out.printf("%-20s es un fichero\n", nombre);
                }
            }
        }
    }
}
