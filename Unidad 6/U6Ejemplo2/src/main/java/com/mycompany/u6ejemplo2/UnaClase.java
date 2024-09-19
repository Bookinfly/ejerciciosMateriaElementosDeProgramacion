/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u6ejemplo2;

/**
 *
 * @author amado
 */
public class UnaClase {
    private static int contador = 0; //variable privada y estática
    UnaClase(){//constructo de la clase
        contador++; //Al crear una clase instabcua el contador cuenta
    }
    public static int getContador(){// retorno el valor de contador que es static
        return contador;  // Tambi´en el m´etodo es est´atico
    }
}
