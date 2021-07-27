package Codigo;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class GestorArchivo {

    //leer un archivo
    public String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leido");
        }
        return contenido;
    }

    // ver los archivos de un directorio especifico
    public String[] listaArchivos(String ruta) {
        File f = new File(ruta);
        String[] archivos = f.list();
        return archivos;
    }
    public static void muestraContenido(String ruta) {
        String cadena = "";
        FileReader f = null;
        try {
            f = new FileReader(ruta);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader b = new BufferedReader(f);
        while (true) {
            try {
                if (!((cadena = b.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(cadena);
        }
        try {
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
