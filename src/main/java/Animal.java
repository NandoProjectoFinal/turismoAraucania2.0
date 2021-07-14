import java.util.Scanner;

public class Animal {

    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static void mostrarAnimales() {
        System.out.println("\nEsta es una lista de los animales que se pueden\n" +
                "encontrar en la IX Región de La Araucanía "+
                "\n" +
                "This is a list of the animals that can be found\n" +
                "in the IX Region of La Araucanía ");
        System.out.println("\n Para acceder a ellos, seleccione el tipo de animal que desea observar \n" +
                " To access them, select the type of animal you want to observe");
        System.out.println("[1] Mamíferos / Mammals");
        System.out.println("[2] Reptiles / Reptiles");
        System.out.println("[3] Anfibios / Amphibians");
        System.out.println("[4] Aves / Birds");
        System.out.println("[5] Peces / Fishes");
        System.out.println("[6] Insectos / Insects");
    }

    public static void seleccionarTipoAnimal() {
        String opcion = "";
        boolean a;
        do {
            opcion = ingresarRespuesta();
            a = validarAnimal(opcion);
            switch (opcion) {
                case "1": {
                    listaMamiferos(); // Lista
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombreMamiferos()[respuesta]);
                    System.out.println(datoMamiferos()[respuesta]);
                    break;
                }
                case "2": {
                    listaReptiles();
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombreReptiles()[respuesta]);
                    System.out.println(datoReptiles()[respuesta]);
                    break;
                }
                case "3": {
                    listaAnfibios();
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombreAnfibios()[respuesta]);
                    System.out.println(datoAnfibios()[respuesta]);
                    break;
                }
                case "4": {
                    listaAves();
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombreAves()[respuesta]);
                    System.out.println(datosAves()[respuesta]);
                    break;
                }
                case "5": {
                   listaPeces();
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombrePeces()[respuesta]);
                    System.out.println(datosPeces()[respuesta]);
                    break;
                }
                case "6": {
                    listaInsectos();
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    System.out.println(nombreInsectos()[respuesta]);
                    System.out.println(datoInsecto()[respuesta]);
                    break;
                }
                default: {
                    System.out.println("Opción no válida / Invalid option");
                    a = false;
                    break;
                }
            }
        } while (a == false);
    }

    public static String[] datoInsecto() {
        String[] datos = listaSeleccion("Insectos\\Datos");
        return datos;
    }

    public static String[] nombreInsectos() {
        String[] listaNombre = listaSeleccion("Insectos\\Nombres");
        return listaNombre;
    }

    public static void listaInsectos() {
        System.out.println("Insectos / Insects");
        String[] listaNombre = listaSeleccion("Insectos\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] nombrePeces() {
        String[] listaNombre = listaSeleccion("Peces\\Nombres");
        return listaNombre;
    }

    public static String[] datosPeces() {
        String[] datos = listaSeleccion("Peces\\Datos");
        return datos;
    }

    public static void listaPeces() {
        System.out.println("Peces / Fishes");
        String[] listaNombre = listaSeleccion("Peces\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] nombreAves() {
        String[] listaNombre = listaSeleccion("Aves\\Nombres");
        return listaNombre;
    }

    public static String[] datosAves() {
        String[] datos = listaSeleccion("Aves\\Datos");
        return datos;
    }

    public static void listaAves() {
        System.out.println("Aves / Birds");
        String[] listaNombre = listaSeleccion("Aves\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] nombreAnfibios() {
        String[] listaNombre = listaSeleccion("Anfibios\\Nombres");
        return listaNombre;
    }

    public static String[] datoAnfibios() {
        String[] datos = listaSeleccion("Anfibios\\Datos");
        return datos;
    }

    public static void listaAnfibios() {
        System.out.println("Anfibios / Amphibians");
        String[] listaNombre = listaSeleccion("Anfibios\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] datoReptiles() {
        String[] datos = listaSeleccion("Reptiles\\Datos");
        return datos;

    }

    public static String[] nombreReptiles() {
        String[] listaNombre = listaSeleccion("Reptiles\\Nombres");
        return listaNombre;
    }

    public static void listaReptiles() {
        System.out.println("Reptiles / Reptiles");
        String[] listaNombre = listaSeleccion("Reptiles\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] datoMamiferos() {
        String[] datos = listaSeleccion("Mamiferos\\Datos mamiferos");
        return datos;
    }

    public static void listaMamiferos() {
        System.out.println("Mamíferos / Mammals");
        String[] listaNombre = listaSeleccion("Mamiferos\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] nombreMamiferos(){
        String[] listaNombre = listaSeleccion("Mamiferos\\Nombres");
        return listaNombre;
    }
    public static boolean validarAnimal(String dato) {
        try {
            int numero = Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static String[] listaSeleccion(String seleccion){
        GestorArchivo a = new GestorArchivo();
        String ruta = "D:\\Proyectos\\turismoAraucania\\Animales\\"+ seleccion +"\\";
        String[] lista = a.leerArchivo(ruta).split("\n");
        return lista;
    }
}
