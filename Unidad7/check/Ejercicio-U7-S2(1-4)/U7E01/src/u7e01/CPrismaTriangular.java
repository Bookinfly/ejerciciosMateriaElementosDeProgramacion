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
public class CPrismaTriangular {
   private CTriangulo T;
    private CRectangulo R;
    private double superficie;
    public void inicializar(double a, double b){
        T= new CTriangulo();
        T.inicializar(a,0);
        T.calcular();
        R= new CRectangulo();
        R.inicializar(a, b);
        R.calcular();}
    public void calcular(){
        superficie= T.ver_superficie() * 2 + R.ver_superficie() * 3;}
    public double ver_superficie(){return superficie;} 
}
