/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7_02;

/**
 *
 * @author Fotografia
 * 
 * Triángulo (triangulo1): Representa una de las caras triangulares del prisma, con lado a.

Rectángulo (rectangulo): Representa una de las caras rectangulares del prisma, con lados a y b.

Método calcularSuperficie():
* Calcula la superficie total del prisma triangular sumando dos veces la superficie del triángulo
* y tres veces la superficie del rectángulo, lo cual es correcto según la especificación de tener
* 2 caras triangulares y 3 caras rectangulares.
 */
public class PrismaTriangular extends Triangulo {
    private double altura;

    public PrismaTriangular(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double calcularSuperficiePrisma() {
        // Calcular el área total del prisma triangular
        double areaBase = super.calcularSuperficie(); // Área de la base triangular
        double areaLateral = 3 * lado * altura; // Área de las tres caras laterales

        return 2 * areaBase + areaLateral; // Área total del prisma
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

