/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author amado
 */
public class TFigura {
    private float areaTotal;
    protected TRectangulo rec1 = new TRectangulo();
    protected TRectangulo rec2 = new TRectangulo();
    
    public void datosFiguraT (float p, float q, float r, float s){
        rec1.iniciarDatos(p, q);
        rec1.calcularArea();
        rec2.iniciarDatos(r, s);
        rec2.calcularArea();
    }
    
    public void calcularAreaTotal(){
        areaTotal = rec1.area + rec2.area;
    }
    
    public float verAreaTotal(){
        return areaTotal;
    }
}

