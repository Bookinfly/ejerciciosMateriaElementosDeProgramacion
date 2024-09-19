/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u6ejemplo01;

/**
 *
 * @author amado
 */
public class UnaClase {
    private int a; //atributo de la clase
    //Metodo de acceso público, al cual le paso el parámetro x que asigno a la variable miembro a
    public void set_a(int x){
        a = x;
    }
    
    // este método es publico y retorna el valor de a que se entero
    public int get_a(){
        return a;
    }
}
