import java.util.Scanner;

public class Lugares {
    private String Nombre;
    private String Ubicacion;

    public Lugares(String nombre, String ubicacion) {
        Nombre = nombre;
        Ubicacion = ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public static String[] listanombres(){
        GestorArchivo a = new GestorArchivo();
        String ruta = "C:\\Users\\hp\\Downloads\\turismoAraucania2.0\\Lugares\\Lugares\\";
        String[] lista = a.leerArchivo(ruta).split("\n");
        return lista;
    }
    public static String[] listadatos(){
        GestorArchivo a = new GestorArchivo();
        String ruta = "C:\\Users\\hp\\Downloads\\turismoAraucania2.0\\Lugares\\Localización\\";
        String[] datos = a.leerArchivo(ruta).split("\n");
        return datos;
    }
    public static void Lugares(){
        System.out.println("Aquí está la lista de datos sobre los lugares turísticos / " + " Here is the list of facts about tourist places");
        String[] listaNombre = listanombres();
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i)+"]" + " " + listaNombre[i]);
        }
    }
    public static int seleccion() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("¿Qué lugar desea ver?/ What place do you want to see?");
            respuesta = teclado.nextInt();
        } while (respuesta > 8 || respuesta<0 );
        return respuesta;
    }
}
