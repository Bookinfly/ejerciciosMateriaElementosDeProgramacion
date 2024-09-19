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
public class TEsfera extends TCirculo{
    double supEsfera, volEsfera;
    public void calularSuperficie(){
        supEsfera= 4 * Math.PI * Math.pow(verRadio(),2);
    }
    public void calcularVolumen(){
        volEsfera= 4 * Math.PI* Math.pow(verRadio(),3)/3;
    }
    public double verSuperficie(){
        return supEsfera;
    }
    public double verVolumen(){
        return volEsfera;
    }
}
