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
                    System.out.println(arregloMamiferos()[respuesta]);
                    System.out.println(arregloDatos()[respuesta]);
                    break;
                }
                case "2": {
                    System.out.println("Reptiles / Reptiles");
                    String[] listaNombre = listaseleccion("Reptiles\\Nombres");
                    for (int i=0; i<listaNombre.length; i++){
                        System.out.println("["+(i)+"]" + " " + listaNombre[i]);
                    }
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    String[] datos = listaseleccion("Reptiles\\Datos");
                    for (int i=0; i<listaNombre.length; i++){
                        if (respuesta==i){
                            System.out.println(listaNombre[i]);
                            System.out.println(datos[i]);
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.println("Anfibios / Amphibians");
                    String[] listaNombre = listaseleccion("Anfibios\\Nombres");
                    for (int i=0; i<listaNombre.length; i++){
                        System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
                    }
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    String[] datos = listaseleccion("Anfibios\\Datos");
                    for (int i=0; i<listaNombre.length; i++){
                        if (respuesta==i){
                            System.out.println(listaNombre[i]);
                            System.out.println(datos[i]);
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("Aves / Birds");
                    String[] listaNombre = listaseleccion("Aves\\Nombres");
                    for (int i=0; i<listaNombre.length; i++){
                        System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
                    }
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    String[] datos = listaseleccion("Aves\\Datos");
                    for (int i=0; i<listaNombre.length; i++){
                        if (respuesta==i){
                            System.out.println(listaNombre[i]);
                            System.out.println(datos[i]);
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("Peces / Fishes");
                    String[] listaNombre = listaseleccion("Peces\\Nombres");
                    for (int i=0; i<listaNombre.length; i++){
                        System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
                    }
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    String[] datos = listaseleccion("Peces\\Datos");
                    for (int i=0; i<listaNombre.length; i++){
                        if (respuesta==i){
                            System.out.println(listaNombre[i]);
                            System.out.println(datos[i]);
                        }
                    }
                    break;
                }
                case "6": {
                    System.out.println("Insectos / Insects");
                    String[] listaNombre = listaseleccion("Insectos\\Nombres");
                    for (int i=0; i<listaNombre.length; i++){
                        System.out.println("["+(i+1)+"]" + " " + listaNombre[i]);
                    }
                    System.out.println("¿Qué animal desea conocer? / What animal do you want to know?");
                    int respuesta = Integer.parseInt(ingresarRespuesta());
                    String[] datos = listaseleccion("Insectos\\Datos");
                    for (int i=0; i<listaNombre.length; i++){
                        if (respuesta==i){
                            System.out.println(listaNombre[i]);
                            System.out.println(datos[i]);
                        }
                    }
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

    private static String[] arregloDatos() {
        String[] datos = listaseleccion("Mamiferos\\Datos mamiferos");
        return datos;
    }

    public static void listaMamiferos() {
        System.out.println("Mamíferos / Mammals");
        String[] listaNombre = listaseleccion("Mamiferos\\Nombres");
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i)+"]" + " " + listaNombre[i]);
        }
    }

    public static String[] arregloMamiferos(){
        String[] listaNombre = listaseleccion("Mamiferos\\Nombres");
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

    public static String[] listaseleccion(String seleccion){
        System.out.println("¿Qué tipo de animal desea ver? / what type of animal do you wants see?" );
        System.out.println();
        GestorArchivo a = new GestorArchivo();
        String ruta = "D:\\Proyectos\\turismoAraucania\\Animales\\"+ seleccion +"\\";
        String[] lista = a.leerArchivo(ruta).split("\n");
        return lista;
    }
}
