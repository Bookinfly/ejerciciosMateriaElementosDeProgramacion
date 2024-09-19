/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author amado
 */
public class TRectangulo {
    protected float a,b, area;
    
    public void iniciarDatos(float d1, float d2) {
        a = d1;
        b = d2;
    }
    
    public void calcularArea(){
        area = a * b;
    }
    
    public float verArea(){
        return area;
    }
}
