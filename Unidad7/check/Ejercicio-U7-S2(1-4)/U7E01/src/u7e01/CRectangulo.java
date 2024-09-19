/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7e01;

/**
 *
 * @author usuario
 */
public class CRectangulo extends CPoligono {
  protected double lado_b;
  public void inicializar(double a, double b){lado_a= a; lado_b= b;}
  public void calcular(){superficie= lado_a * lado_b;}
  public double ver_lado_b(){return lado_b;};
  }
