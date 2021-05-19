/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.ArrayList;
import paquete6.Hospital;

public class Ejecutor {
    // nombre del archivo

    String nombreArchivo = "hoapitales.txt";

    Hospital c1 = new Hospital("ZARUMA", 20, 250.00);

    ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
    // establecer el valor del atributo registro

    escritura.establecerRegistro (c1);
    // estabalecer en el archivo el atributo del registro

    escritura.establecerSalida ();

    escritura.cerrarArchivo ();

    // proceso para lectura del archivo
    ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);

    lectura.establecerLista ();
    // System.out.println(lectura.toString());

    System.out.println (lectura);

    lectura.cerrarArchivo ();
}
