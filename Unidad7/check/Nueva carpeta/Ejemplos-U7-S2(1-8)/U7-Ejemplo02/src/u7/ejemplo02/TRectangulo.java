/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo02;

/**
 *
 * @author usuario
 */
public class TRectangulo {
    protected double a,b, area;
    public void iniciarDatos(double d1, double d2){
    a= d1;
    b= d2;
    };
  public void calcularArea(){
      area= a * b;
  }
  public double verArea(){
      return area;
  }
}
