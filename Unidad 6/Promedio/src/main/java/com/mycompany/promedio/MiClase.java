/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promedio;

import java.text.DecimalFormat;

/**
 *
 * @author amado
 * codigo para calcular el promedio de 3 materias con una clase
 */
public class MiClase {
    
    private String alumno;//declaro var que contendra el nombre del alumno
    private double matA, matB, matC;//declaro las materias
    
    MiClase(String nombre, double materiaA, double materiaB, double materiaC){
        //constructor que ingresa las variables de los params como argumentos
        this.matA = materiaA;
        this.matB = materiaB;
        this.matC = materiaC;
        this.alumno = nombre;
    }
    
    public String promediar(){
        //metodo de acceso publico para acceder desde ventana
        double prom = (matA + matB + matC) / 3;//calcula promedio
        DecimalFormat df = new DecimalFormat("#.##");//restringimos decimal
        String formato = df.format(prom);
        String text = "El Promedio de " + alumno + " es: ";//concantenamos
        String salida =  text + formato;//concatenamos
        return salida;//devolvemos la frase completa
    }
}

