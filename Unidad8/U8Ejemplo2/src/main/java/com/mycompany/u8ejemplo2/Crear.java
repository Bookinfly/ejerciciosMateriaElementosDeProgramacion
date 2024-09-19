/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u8ejemplo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author amado
 */
public class Crear {
    //public static Collection<MiDato> coleccion(){ //Metodo coleccion que devuelve Cole 
        //Vector<MiDato> v = new Vector<MiDato>();
    //Vector<MiDato> v = new Vector<MiDato>(); 
        public static Collection<MiDato> coleccion() {
        // Puedes usar cualquier tipo de colección. Aquí se elige ArrayList.
        Collection<MiDato> v = new ArrayList<MiDato>(); 
        // LinkedList<MiDato> v = new LinkedList<MiDato>(); 
        // Vector<MiDato> v = new Vector<MiDato>();       
        
        int dat;
        for (int x=0; x<10; x++){ 
            dat =  (int)((Math.random() * 100) % 10) ;//genera números 
            v.add(new MiDato(dat));//Inserta en el vector 
        } 
        return v; 
    } 
}

