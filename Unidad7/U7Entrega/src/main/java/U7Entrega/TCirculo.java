/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U7Entrega;

/**
 *
 * @author amado
 */
public class TCirculo {
   protected double radio, area, perimetro;  
   
   
    public void cargarRadio(double r){
        radio = r;
    }   
    public double verRadio(){
        return radio;
    }    
    public void calcularArea(){
        area = Math.PI * Math.pow(radio, 2);
    }  
    public void calcularPerimetro(){
        perimetro = Math.PI * 2 * radio;
    } 
    public double verArea() {
        return area;
    }    
    public double verPerimetro(){
        return perimetro;
    }
    
}
