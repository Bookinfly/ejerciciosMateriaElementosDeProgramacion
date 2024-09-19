/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_04;

/**
 *
 * @author Fotografia
 */
public class Triangulo {
    protected double lado;

    
    public Triangulo(double lado){
        this.lado = lado;
    }
    
    public double calcularSuperficie() {
        // Fórmula para calcular el área de un triángulo equilátero
        return (Math.sqrt(3) / 4) * lado * lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
