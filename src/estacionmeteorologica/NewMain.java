/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionmeteorologica;

import java.util.Arrays;

/**
 *
 * @author josè veròn
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       EstacionMeteorologica temp= new EstacionMeteorologica ();
       System.out.println(" Temperaturas Registradas " + Arrays.toString(temp.generarTemp()));
        System.out.println(" La Temperatura mas alta del Mes " + temp.Alta());
         System.out.println(" La Temperatura mas baja del Mes " + temp.Baja());
         System.out.println(" La Temperatura media del Mes " + temp.Media());
          System.out.println( temp.sobreMedia() +" dias sobre la temperatura media ");
          System.out.println(temp.bajoMedia()+" dias debajo la temperatura media ");
    }
    
}
