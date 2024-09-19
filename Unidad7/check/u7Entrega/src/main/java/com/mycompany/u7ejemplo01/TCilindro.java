 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u7ejemplo01;

/**
 *
 * @author amado
 */
public class TCilindro extends TCirculo {
    private double altura, supCilindro, volCilindro;
    public void cargarAltura(double alt){
        altura = alt;
    }    
    public void calcularVolumen(){
        volCilindro= verArea() * altura;
    }    
    public void calcularSuperficie(){
        supCilindro = verPerimetro() * altura;
    }   
    public double verSupCilindro(){
         return supCilindro;
    } 
    public double verVolCilindro(){
        return volCilindro;
    }

}
