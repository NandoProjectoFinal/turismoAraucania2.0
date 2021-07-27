/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TurismoAraucania;

import Ventanas.VentanaMenu;

/**
 *
 * @author hp
 */
public class MenuTipo {
    public static VentanaMenu x = new VentanaMenu();
     public static void mostrar(){ x.setVisible(true);}   // creamos estos metodos para la ventana Login de esta manera es mas facil manipular su visibilidad
     public static void ocultar(){ x.setVisible(false);}
     
     public static void BotonIngresarFloraVentana (){
    Controlador_Flora.mostrar();
    ocultar();
    } 
       public static void BotonIngresarVentanaAnimal (){
    Controlador_Animales.mostrar();
    ocultar();
    }
         public static void BotonIngresarVentanaLugares (){
    Controlador_Lugares.mostrar();
    ocultar();
    }
        
}

