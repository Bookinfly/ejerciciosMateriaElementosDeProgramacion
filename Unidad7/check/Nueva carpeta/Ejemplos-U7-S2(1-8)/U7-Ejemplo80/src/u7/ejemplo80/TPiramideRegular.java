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
public class TPiramideRegular implements TPoligono, TTriangulo{
    protected float radio, base, altura;
    protected int nlados, lado1;
    void cargar_datos(float rad, int n, float a,float b){
    cargar_datosP(rad,n);
    cargar_datosT(a,b);
    }
    float ver_area(){
    return ver_areaP() + ver_areaT() * nlados;
    }

    public void cargar_datosP(float r, int nla) {
        radio= r;
        nlados= nla;
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

    public void cargar_datosT(float a, float b) {
    altura= a;
    base= b;
    }
    public float ver_areaT(){
        return (base * altura) / 2;
    }
}
