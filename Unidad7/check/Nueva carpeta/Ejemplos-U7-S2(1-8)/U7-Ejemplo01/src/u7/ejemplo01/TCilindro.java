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
public class TCilindro extends TCirculo{
    double altura, supCilindro, volCilindro;
    public void cargarAltura(double alt){
        altura= alt;
    }
    public void calcularVolumen(){
        volCilindro= verArea() * altura;
    }
    public void calcularSuperficie(){
        supCilindro= verPerimetro() * altura;
    }
    public double verSupCilindro(){
        return supCilindro;
    }
    public double verVolCilindro(){
        return volCilindro;
    }
}

