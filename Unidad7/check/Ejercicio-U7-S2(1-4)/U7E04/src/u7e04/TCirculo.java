/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7e04;

/**
 *
 * @author Escuela
 */
public class TCirculo {
    private double radio, perimetro, superficie;
    public void inicializar(double r){radio= r;}
    public void calcular(){
    superficie= Math.PI*Math.pow(radio,2);
    perimetro= 2*Math.PI*radio;}
    public double ver_perimetro(){return perimetro;}
    public double ver_superficie(){return superficie;}
    public double ver_radio(){return radio;}
}
