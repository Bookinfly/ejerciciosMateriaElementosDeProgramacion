/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo07;

/**
 *
 * @author usuario
 */
public abstract class CPoligono {
  protected  int ancho, largo;
  public void fijar_valores (int a, int b)
      { ancho=a; 
        largo=b; }
  public abstract int area();
  }
