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
public class CTriangulo extends CPoligono {
  public void inicializar(double a, double b){lado_a= a;}
  public void calcular()
    {superficie= Math.sqrt((Math.pow(lado_a,2)-Math.pow(lado_a/2,2)));}
  }
