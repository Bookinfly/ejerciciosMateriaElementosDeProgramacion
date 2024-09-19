/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u7.ejemplo03;

/**
 *
 * @author usuario
 */
public class UnaClase {
        int i;
    UnaClase(){ //Constructor sin parametros
	i = 10;
    }
    UnaClase(int numero){  //Constructor con parametros
		this.i = numero;
    }
    public void sumaX(int  x){
		i = i + x;
	}
    public int verI(){
        return i;
    }
}
