import java.util.Scanner;



// DISMINUIR ANIMALES
// PRUEBAS UNITARIAS
// INTERFAZ GRAFICA
// UML
// INFORME







public class Main {

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        boolean a;
        do {
            menuPrincipal();
            a = tipodeBusqueda(ingresarRespuesta());
        } while (!a);

    }
    public static void menuPrincipal() {
        System.out.println("**********************************************************");
        System.out.println("*             Bienvenido a Turismo Araucanía            *");
        System.out.println("*                            /                           *");
        System.out.println("*              Welcome to Turismo Araucanía              *");
        System.out.println("**********************************************************");
        System.out.println("Por favor, seleccione una de las opcíones/Please select one of the options");
        System.out.println("[1] ver lugares turísticos/see tourist places");
        System.out.println("[2] ver árboles nativos/see native trees");
        System.out.println("[3] ver animales nativos/see native animals");
        System.out.println("[4] Salir del Programa/Exit the program");
    }
    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static boolean tipodeBusqueda(String ingresoDatos) {
        boolean a;
        switch (ingresoDatos) {
            case "1" -> {
                do {
                    System.out.println("Lista de lugares turísticos/ List of tourist places ");
                    a = true;
                    Lugares.Lugares();
                    int z = Lugares.seleccion();
                    String[] nombre = Lugares.listanombres();
                    String[] localización = Lugares.listadatos();
                    Lugares x = new Lugares(nombre[z],localización[z]);
                    System.out.println(x.getNombre());
                    System.out.println(x.getUbicacion());
                    System.out.println("¿Desea ver más Lugares?/Do you want to see more Places?");
                    textoSalida();
                    a=salir();
                }while(a==true);
            }
            case "2" -> {
                do {
                    System.out.println("Lista de árboles nativos/List of native trees");
                    a = true;
                    Flora.flora(); // mostrar
                    String[] arr = Flora.datos();
                    Flora fa = new Flora(arr[0],arr[1]);
                    System.out.println(fa.getNombre());
                    System.out.println(fa.getTipo());
                    System.out.println("Desea ver mas arboles?");
                    textoSalida();
                    a=salir();
                }while (a==true);
                break;
            }
            case "3" -> {
                System.out.println("Lista de los animales nativos de la zona/ List of native animals in the area");
                a = true;
                Animal.mostrarAnimales();
                Animal.seleccionarTipoAnimal();
                break;
            }
            case "4" -> {
                System.out.println("Desea Salir?");
                textoSalida();
                a=salir();
                break;
            }
            default -> {
                System.out.println("opción no válida/invalid option");
                a = false;
                break;
            }
        }
        return a;
    }

    public static boolean salir(){
        boolean a= true;
        int b=0;
        do {
            String respuesta = ingresarRespuesta();
            switch (respuesta){
                case "1":
                    System.out.println("Gracias por ocupar el programa / Thank you for occupying the program");
                    a=true;
                    b=1;
                    break;
                case "2":
                    a=false;
                    b=2;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida / Enter a valid option");
                    b=0;
                    break;
            }
        }while(b==0);
        return a;
    }
    public static void textoSalida() {
        System.out.println("[1] Si / yes");
        System.out.println("[2] No / no");
    }
}
