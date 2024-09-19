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
public class TFigura {
    private  double areaTotal;
    protected  TRectangulo rec1= new TRectangulo();
    protected  TRectangulo rec2= new TRectangulo();
    public void datosFiguraT(double p,double q,double r,double s){
        rec1.iniciarDatos(p, q);
        rec1.calcularArea();
        rec2.iniciarDatos(r, s);
        rec2.calcularArea();
    };
  public void calcularAreaTotal(){
    areaTotal= rec1.area + rec2.area;
  }
  public double verAreaTotal(){
      return areaTotal;
  }
}
