/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u7ejemplo01;

/**
 *
 * @author amado
 */
public class TEsfera extends TCirculo {
    private double supEsfera, volEsfera;    
    public void calcularSuperficie(){
        supEsfera = 4 * Math.PI * Math.pow(verRadio(), 2);
    }   
    public void calcularVolumen(){
        volEsfera = 4 * Math.PI * Math.pow(verRadio(), 3) / 3;
    }  
    public double verSuperficie(){
        return supEsfera;
    }    
    public double verVolumen(){
        return volEsfera;
    }
}
