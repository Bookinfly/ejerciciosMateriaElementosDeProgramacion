/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpn2amado;

/**
 *
 * @author amado
 * clase que modela los objetos que guardan datos de socios individualmente
 */
public class TSocio {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String categoria;//usar comboBox para que solo se seleccione opciones validas
    private static int contadorSocio = 0; // Variable estática para contar los socios
    private int numeroSocio; // Número de socio único para cada instancia
    
    
    /**
     * Los parámetros son descriptivos
     * @param nombre
     * @param apellido
     * @param dni
     * @param telefono
     * @param categoria 
     * 
     * este es un constructor, el que se utiliza en la mayoría de los casos con un numeroSocio auto-incremental "como in id de SQL"
     * como debía ser list, para poder eliminar a quién quiero con precisión se me ocurrió esto
     */
    public TSocio(String nombre, String apellido,int dni,int telefono,String categoria){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.categoria = categoria;
        this.numeroSocio = aumentarNumSocio();
    }
    
    
    /*
   otro constructor pero para cuando debo rearmar el arrayList obteniendo el num de socio
    */
    public TSocio(String nombre, String apellido,int dni,int telefono,String categoria, int numeroSocio){//otro constructor para el boton abrir
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.categoria = categoria;
        this.numeroSocio = numeroSocio;
    }
    
    
    //getters and setters 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getDNI(){
        return dni;
    }
    public void setDNI(int dni){
        this.dni = dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public int getNumeroSocio(){
        return numeroSocio;
    }
    
    //no se puede setear numero de socio manualmente ni cantidad de socios
    //hubo problemas con btnAbrir, ahora se va a tener que poder
    
    public static int getContadorSocio(){
        return contadorSocio;
    }
    
    public static void setContadorSocio(int contadorSocioLista){
        contadorSocio = contadorSocioLista;
    }
    

    /**
     * Método para ya obtener el texto completo con salto de línea
     * como solo pasa a texto sobrescribí toString
     * @return  retorna el String con el contenido del socio
     */
@Override
    public String toString() {
        String salida = "Socio Nº" + numeroSocio + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "DNI: " + dni + "\n" +
                    "Categoría: " + categoria + "\n" +
                    "Teléfono: " + telefono + "\n";
        return salida;
    }
    
    /**
     * Incrementa el contador de socios
     * @return el numero que representa la cant de socios "utilizado para obtener el num de socio"
     */
    private int aumentarNumSocio(){
        contadorSocio++;
        return contadorSocio;
    }

}



