/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u6ejemplo3;

/**
 *
 * @author amado
 */
public class MiClase {
    
    private int valor = 0; //Atributo privado
    private static int instancia = 0;//atributo privadoo y estatico
    MiClase(){//constructor sin par´ametros inicializa la clase incrementando 1.
        instancia++;
    }
    
    void setValor(int x){
        valor = x; //asigna el valor de x a valor
    }
    
    int getValor(){
        return valor; //Retorna valor
    }

    static int getInstancia(){
        return instancia; //Retorna Instancia0
    }
    
    ////Metodo para comparar el atributo valor y ver si son iguale
    public boolean equals(MiClase o){ //el par´ametro es un objeto de la misma
        return this.valor == o.valor;
    }
}
