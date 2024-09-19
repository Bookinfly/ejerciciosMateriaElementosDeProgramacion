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
public abstract class CPoligono {
  protected  double lado_a, superficie;
  public abstract void inicializar(double a, double b);
  public abstract void calcular();
  public double ver_lado_a(){return lado_a;}
  public double ver_superficie(){return superficie;}
  }
