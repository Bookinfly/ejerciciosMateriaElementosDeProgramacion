/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7e04;

/**
 *
 * @author Escuela
 */
public class TCoronaCircular {
    protected TCirculo C1, C2;
    private double superficieCC;
    public void inicializar(double r1, double r2){
    C1= new TCirculo();C1.inicializar(r1);C1.calcular();
    C2= new TCirculo();C2.inicializar(r2);C2.calcular();}
    public void calcularSCC(){
    superficieCC= C2.ver_superficie() - C1.ver_superficie();}
    public double ver_superficieCC(){return superficieCC;}   
}
