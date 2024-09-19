/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_04;

/**
 *
 * @author Fotografia
 */
public class Circulo {
    protected double radio;
    protected double areaCirculo;
    protected double perimetro;
    
    // Constructor que recibe el radio del círculo
    public Circulo(double radio){
        this.radio = radio;
    }
    
    // Método para calcular el área del círculo
    public double calcularAreaCirculo(){
        areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;
    }
    
    public double calcularPerimetro(){
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
