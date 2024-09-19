/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo01;

/**
 *
 * @author usuario
 */
public class TCirculo {
        double radio, area, perimetro;
    public void cargarRadio(double r){
        radio= r;
    }
    public double verRadio(){
        return radio;
    }
    public void calcularArea(){
        area= Math.PI * Math.pow(radio,2);
    }
    public void calcularPerimetro(){
        perimetro= Math.PI * 2 * radio;
    }
    public double verArea(){
        return area;
    }
    public double verPerimetro(){
        return perimetro;
    }
    
}
