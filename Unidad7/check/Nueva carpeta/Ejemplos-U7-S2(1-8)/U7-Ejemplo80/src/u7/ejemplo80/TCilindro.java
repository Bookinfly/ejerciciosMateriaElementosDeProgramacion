/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo80;

/**
 *
 * @author usuario
 */
public class TCilindro implements TCirculo, TRectangulo {
    protected float radio, lado1,lado2, area;
    public void cargar_datos(float r, float lado1){
        cargar_datosC(r);
        cargar_datosR(lado1, ver_perimetroC());
    }
    public float ver_area(){
        area= ver_areaC() * 2 + ver_areaR();
        return area;
    }
    public void cargar_datosC(float r1) {
        radio = r1;
    }

    public float ver_areaC() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    public float ver_perimetroC() {
        return (float) (Math.PI * 2 * radio);
    }

    public float ver_areaR() {
        return lado1 * lado2;
    }

    public void cargar_datosR(float l1, float l2) {
        lado1= l1;
        lado2= l2;
    }
}
