/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TurismoAraucania;

import Ventanas.FloraVentana;



/**
 *
 * @author hp
 */public class Controlador_Flora {
    public static FloraVentana x = new FloraVentana();
     public static void mostrar(){ x.setVisible(true);}   // creamos estos metodos para la ventana Login de esta manera es mas facil manipular su visibilidad
     public static void ocultar(){ x.setVisible(false);}
     
     public static void BotonSalir (){ 
     ocultar();
    TurismoAraucania.MenuTipo.mostrar();

     }
    
}
