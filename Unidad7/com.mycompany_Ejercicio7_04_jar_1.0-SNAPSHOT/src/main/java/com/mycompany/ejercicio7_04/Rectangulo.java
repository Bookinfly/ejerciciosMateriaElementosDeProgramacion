/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_04;

/**
 *
 * @author Fotografia
 */
public class Rectangulo {
    private double x; // Base
    private double y; // Altura

    public Rectangulo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularSuperficie() {
        return x * y;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
