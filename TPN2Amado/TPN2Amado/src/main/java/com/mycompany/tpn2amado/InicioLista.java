/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn2amado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Clase para inicializar y manipular la lista de socios desde un archivo.
 * pensada para cargar datos iniciales
 * por falta de tiempo y miedo a dañar el código opte por modularizar esto y afectar lo que ya funciona "de alguna forma lo rompí igual pero ya lo repare..."
 */
public class InicioLista {
    
    /**
     * Método para iniciar la lista de socios leyendo desde un archivo.
     * @return ArrayList de TSocio con los socios leídos desde el archivo.
     * claramente recicle el código de btnAbrir
     * 
     */
    public static ArrayList<TSocio> iniciarArchivo() {
        ArrayList<TSocio> asociados = new ArrayList<>();
        String ficheroSocios = "socios.txt"; // Nombre del archivo de socios
        
        // Variables para los datos de cada socio
        int dni, telefono, numeroSocio;
        String apellido, nombre, categoria;
        nombre = null;
        apellido = null;
        categoria = null;
        dni = 0;
        telefono = 0;
        numeroSocio = 0;
        TSocio socioActual = null;

        
        /*
        Bloque que leé el archivo y arma los TSocio con datos tomados
        por concurrencia del fichero los usa en el constructor y los suma al arrayList
        @return asociados "arrayList"
        */
        try {
            FileReader lector = new FileReader(ficheroSocios);
            BufferedReader contenido = new BufferedReader(lector);
            String linea;
            
            // Recorremos el archivo línea por línea
            while ((linea = contenido.readLine()) != null) {
                // Recorremos las líneas actualizando variables según el formato esperado
                if (linea.startsWith("Nombre:")) {
                    nombre = linea.substring("Nombre: ".length());
                } else if (linea.startsWith("Apellido:")) {
                    apellido = linea.substring("Apellido: ".length());
                } else if (linea.startsWith("DNI:")) {
                    dni = Integer.parseInt(linea.substring("DNI: ".length()));
                } else if (linea.startsWith("Teléfono:")) {
                    telefono = Integer.parseInt(linea.substring("Teléfono: ".length()));
                } else if (linea.startsWith("Categoría: ")) {
                    categoria = linea.substring("Categoría: ".length());
                } else if (linea.startsWith("Socio Nº")) {
                    numeroSocio = Integer.parseInt(linea.substring("Socio Nº".length()));
                }
                
                // Si encontramos la línea que marca el final de los datos de un socio, creamos un objeto TSocio y lo agregamos a la lista
                if (linea.startsWith("Teléfono:")) {
                    socioActual = new TSocio(nombre, apellido, dni, telefono, categoria, numeroSocio);
                    asociados.add(socioActual);
                    // Reiniciamos las variables para el próximo socio, me parece innecesario pero si falla se va a notar
                    nombre = null;
                    apellido = null;
                    categoria = null;
                    dni = 0;
                    telefono = 0;
                    numeroSocio = 0;
                    socioActual = null;
                }
            }
            lector.close(); // Cerramos el lector de archivos "despues del ciclo"
        } catch (Exception e) {
            System.out.println("ERROR: No se pudo leer el archivo"); // Mensaje de error si ocurre una excepción
        }
        return asociados; // Devolvemos la lista de socios leída desde el archivo
    }
    
    /**
     * Método para obtener un String con la representación de todos los socios.
     * @return String con la representación de todos los socios en la lista.
     */
    public static String salidaTexto() {
        ArrayList<TSocio> asociados = iniciarArchivo(); // Obtenemos la lista de socios
        
        StringBuilder salida = new StringBuilder();
        for (TSocio socio : asociados) {
            salida.append(socio.toString()).append("\n"); // Agregamos cada socio al StringBuilder
        }
        
        return salida.toString(); // Devolvemos el resultado como un String
    }
}

