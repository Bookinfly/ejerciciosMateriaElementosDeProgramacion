/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U7Entrega;

/**
 *
 * @author amado
 */
public class TCilindroHueco extends TCilindro {
    protected double radioInterior;
    protected double volCilindroInterior;
    protected double supCilindroInterior;
    protected double volPared;

public TCilindroHueco (double radio, double altura, double radioInt) {
    this.radio = radio;
    this.altura = altura;
    this.radioInterior = radioInt;
    System.out.println("Radio exterior: " + radio);
    System.out.println("Altura: " + altura);
    System.out.println("Radio interior: " + radioInterior);
    calcularArea();
    calcularPerimetro();
    calcularVolumen(); // calcula volCilindro
    calcularSuperficie(); // calcula supCilindro
    calcularVolumenInterior(); // calcula volCilindroInterior
    calcularSuperficieInterior(); // calcula supCilindroInterior
    calcularVolumenPared(); // calcula volPared
}




    public void calcularVolumenInterior(){
    volCilindroInterior = Math.PI * Math.pow(radioInterior, 2) * altura;
    System.out.println("Volumen interior: " + volCilindroInterior);
}

public void calcularVolumenPared(){
    volPared = (verVolCilindro()) - (verVolCilindroInterior());
    System.out.println("Volumen de la pared: " + volPared);
}

    public void calcularSuperficieInterior(){
        supCilindroInterior = 2 * Math.PI * radioInterior * altura;
    }

    public double verVolCilindroInterior(){
        return volCilindroInterior;
    }

    public double verSupCilindroInterior(){
        return supCilindroInterior;
    }


    public double verVolPared(){
        return volPared;
    }
}




