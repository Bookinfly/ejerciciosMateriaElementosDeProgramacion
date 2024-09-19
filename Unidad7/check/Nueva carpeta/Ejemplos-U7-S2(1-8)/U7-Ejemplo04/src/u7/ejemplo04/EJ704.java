/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo04;

/**
 *
 * @author usuario
 */
public class EJ704 {
    protected int dato;
    EJ704(int valor){
        dato = valor;
    }
    public int verDato(){
        return dato;
    }
   public boolean equals(Object obj){
        if ((obj!=null)&&(obj instanceof EJ704)){
            //Realizamos un moldeado del tipo general Object a Ej704 "casteado"
            EJ704 aux = (EJ704)obj;
            return(this.dato == aux.dato);
            }
        else //no es del tipo esperado
            return false;
        }
}
