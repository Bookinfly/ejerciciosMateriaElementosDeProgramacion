/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_03;

/**
 *
 * @author Fotografia
 */
public class Cilindro extends Circulo {
    
    protected double altura;
    protected Rectangulo rectangulo;
    protected double areaRect;
    protected double areaCilindro;
    protected double volumenCilindro;
    protected double areaCirculo;
    
    public Cilindro(double radio, double altura){
        super(radio);
        this.altura = altura;
    }
    
    // Método para armar el rectángulo lateral del cilindro
    public Rectangulo armarRectangulo(){
        double base = calcularPerimetro();
        rectangulo = new Rectangulo(base ,altura);
        areaRect = rectangulo.calcularSuperficie();
        return rectangulo;
    }
    
        // Método para calcular el área total del cilindro
    public double calcularAreaCilindro() {
        // Asegurarse de que el área del rectángulo está calculada
        if (rectangulo == null) {
            armarRectangulo();
        }
        areaCirculo = calcularAreaCirculo(); // Calcular el área del círculo
        areaCilindro = 2 * areaCirculo + areaRect; // Calcular el área total del cilindro
        return areaCilindro;
    }
    
    public double calcularVolumenDelCilindro(){
        areaCirculo = calcularAreaCirculo();
        volumenCilindro = areaCirculo * altura;
        return volumenCilindro; 
    }
    
    // Getters y setters para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getters y setters para rectángulo
    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    // Getters y setters para área del rectángulo
    public double getAreaRect() {
        return areaRect;
    }

    public void setAreaRect(double areaRect) {
        this.areaRect = areaRect;
    }

    // Getters y setters para área del cilindro
    public double getAreaCilindro() {
        return areaCilindro;
    }

    public void setAreaCilindro(double areaCilindro) {
        this.areaCilindro = areaCilindro;
    }
    
        public double getVolumenCilindro() {
        return areaCilindro;
    }

    public void setVolumenCilindro(double volumenCilindro) {
        this.volumenCilindro = volumenCilindro;
    }

    double calcularVolumenCilindro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
