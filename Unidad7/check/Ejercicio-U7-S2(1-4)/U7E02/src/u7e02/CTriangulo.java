/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7e02;

/**
 *
 * @author usuario
 */
public class CTriangulo {
    protected  double lado_a, superficieT;
    public void inicializarT(double a){lado_a= a;}
    public void calcularST(){
        superficieT= Math.sqrt((Math.pow(lado_a,2)-Math.pow(lado_a/2,2)));
    }
    public double ver_lado_a(){return lado_a;}
    public double ver_superficieT(){return superficieT;}
}
