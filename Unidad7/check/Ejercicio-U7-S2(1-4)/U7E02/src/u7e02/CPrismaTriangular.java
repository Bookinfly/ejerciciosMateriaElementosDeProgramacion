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
public class CPrismaTriangular extends CTriangulo{
  private double lado_b, superficieR, superficiePR;
  public void inicializar(double a, double b){inicializarT(a); lado_b= b;}
  public void calcular(){
      calcularST();
      superficieR= lado_a * lado_b;
      superficiePR= superficieT * 2 + superficieR *3;}
  public double ver_lado_b(){return lado_b;}
  public double ver_superficieR(){return superficieR;}
  public double ver_superficiePR(){return superficiePR;}
}
