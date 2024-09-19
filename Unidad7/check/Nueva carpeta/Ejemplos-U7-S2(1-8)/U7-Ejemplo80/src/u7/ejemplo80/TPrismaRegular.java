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
public class TPrismaRegular implements TRectangulo, TPoligono{
    protected float lado1, lado2, radio;
    protected int nlados;
    void cargar_datos(float r,int n,float a,float b){
    cargar_datosP(r,n);
    cargar_datosR(a,b);
}
    float ver_area(){
    return ver_areaR() * nlados + 2 * ver_areaP();
}

    public float ver_areaR() {
        return lado1*lado2;
    }

    public void cargar_datosR(float l1, float l2) {
        lado1= l1;
        lado2= l2;
    }

    public void cargar_datosP(float r, int nla) {
        radio = r;
        nlados = nla;
    }

    public float ver_radioP() {
        return radio;
    }

    public int ver_nladosP() {
        return nlados;
    }

    public float ver_areaP() {
 	return lado1 * nlados * radio /2;
    }
}
