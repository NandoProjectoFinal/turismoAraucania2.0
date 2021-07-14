import java.util.Scanner;

public class Flora {
    private String nombre;
    private String tipo;


    public Flora(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String[] datos() {
        String[] datos = listaseleccion()[seleccion()].split("/");
        return datos;
    }

    public static int seleccion() {
        Scanner teclado = new Scanner(System.in);
        String[] a = listaseleccion();
        int respuesta;
        do {
            System.out.println("¿Qué flora desea ver? / What flora do you want to see?");
            respuesta = teclado.nextInt();
        } while (respuesta > 27 || respuesta<0);
        return respuesta;
    }

    public static String[] listaseleccion(){
        GestorArchivo a = new GestorArchivo();
        String ruta = "D:\\Proyectos\\turismoAraucania\\Flora\\Flora\\";
        String[] listacontipo = a.leerArchivo(ruta).split("\n");
        return listacontipo;
    }

    public static void flora(){
        System.out.println("Aqui esta la lista de datos de Flora Local / Here is the Local Flora data list");
        String[] listaNombre = listaseleccion();
        for (int i=0; i<listaNombre.length; i++){
            System.out.println("["+(i)+"]" + " " + listaNombre[i]);
        }

    }


}
